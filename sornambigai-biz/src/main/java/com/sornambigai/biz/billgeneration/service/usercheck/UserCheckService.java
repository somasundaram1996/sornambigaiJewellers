package com.sornambigai.biz.billgeneration.service.usercheck;

import java.util.Map;

import com.sornambigai.dto.UsersDto;

public interface UserCheckService {
	public UsersDto check(Map<String,Object>requestMap);
}
