package com.sornambigai.biz.billgeneration.service.usercheck.model;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.sornambigai.biz.billgeneration.Contoller.util.JWTUtil;
import com.sornambigai.biz.billgeneration.service.usercheck.CustomUserDetailsService;

@Component
public class CustomJwtFilter extends OncePerRequestFilter {
	@Autowired
	private CustomUserDetailsService userDetailsService;

	@Autowired
	private JWTUtil jwtUtil;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		final String authHeader = request.getHeader("Authorization");
		String userName = null;
		String jwt = null;
		if (Objects.nonNull(authHeader) && authHeader.startsWith("Bearer ")) {
			jwt = authHeader.substring(7);
			userName = jwtUtil.extractUsername(jwt);
		}
		if (Objects.nonNull(userName) && Objects.isNull(SecurityContextHolder.getContext().getAuthentication())) {
			final UserDetails userDetails = userDetailsService.loadUserByUsername(userName);
			if (Objects.nonNull(userDetails) && jwtUtil.validateToken(jwt, userDetails)) {
				UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
						userDetails, null, userDetails.getAuthorities());
				usernamePasswordAuthenticationToken
						.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
				SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
			}
		}
		filterChain.doFilter(request, response);
	}

}
