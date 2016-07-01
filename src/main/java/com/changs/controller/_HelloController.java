package com.changs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class _HelloController {

	@org.springframework.web.bind.annotation.RequestMapping("/hello")
	public @ResponseBody String hello() {
		return "成功访问1";
	}

	@org.springframework.web.bind.annotation.RequestMapping("/helloUser")
	public @ResponseBody com.changs.entity.User helloUser() {
		com.changs.entity.User user = new com.changs.entity.User();
		user.setName("测试用户");
		user.setUserId(1);
		return user;
	
	}
}
