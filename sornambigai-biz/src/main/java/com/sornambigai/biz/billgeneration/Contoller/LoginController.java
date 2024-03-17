package com.sornambigai.biz.billgeneration.Contoller;

import java.util.Base64;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sornambigai.biz.billgeneration.Contoller.util.AuthenticationRequestModel;
import com.sornambigai.biz.billgeneration.Contoller.util.AuthenticationResponseModel;
import com.sornambigai.biz.billgeneration.Contoller.util.JWTUtil;
import com.sornambigai.biz.billgeneration.service.usercheck.CustomUserDetailsService;
import com.sornambigai.biz.billgeneration.service.usercheck.UserCheckService;

@RestController
@RequestMapping(value = "noAuth")
public class LoginController {
	@Autowired
	private UserCheckService userCheckService;

	@Autowired
	private CustomUserDetailsService userDetailsService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JWTUtil jwtUtil;

	@RequestMapping(value = "/auth/checkUser", method = RequestMethod.POST)
	public ResponseEntity<?> checkUser(@RequestBody AuthenticationRequestModel requestModel) throws Exception {
		final UserDetails userDetails = userDetailsService
				.loadUserByUsername(new String(Base64.getDecoder().decode(requestModel.getUserName())));
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
					new String(Base64.getDecoder().decode(requestModel.getUserName())),
					new String(Base64.getDecoder().decode(requestModel.getPassword()))));
		} catch (BadCredentialsException exception) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
		}
		final String jwt = jwtUtil.generateToken(userDetails);
		return ResponseEntity.ok(AuthenticationResponseModel.builder().jwt(jwt).build());
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public boolean addUser(@RequestBody Map<String, Object> requestMap) {
		return userCheckService.addUser(requestMap);
	}

}
