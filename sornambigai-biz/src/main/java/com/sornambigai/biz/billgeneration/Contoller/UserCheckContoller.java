package com.sornambigai.biz.billgeneration.Contoller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sornambigai.biz.billgeneration.service.usercheck.UserCheckService;
import com.sornambigai.dto.UsersDto;
@RestController
public class UserCheckContoller {
	@Autowired
	private UserCheckService userCheckService;
	
	@RequestMapping(value="/checkUser",method=RequestMethod.POST)
	@ResponseBody
	public UsersDto checkUser(@RequestBody Map<String,Object>requestMap) {
		return userCheckService.check(requestMap);
	}
	
	
}
