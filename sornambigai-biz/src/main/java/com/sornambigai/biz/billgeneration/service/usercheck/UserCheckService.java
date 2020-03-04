package com.sornambigai.biz.billgeneration.service.usercheck;

import java.util.Map;

public interface UserCheckService {
	public boolean check(Map<String, Object> requestMap);

	public boolean addUser(Map<String, Object> requestMap);
}
