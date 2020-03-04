package com.sornambigai.biz.billgeneration.Contoller.util;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class AuthenticationResponseModel {

	private final String jwt;
}
