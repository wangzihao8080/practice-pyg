package com.wzh.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wzh.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	//远程注入注解
	@Reference
	private UserService userService;
	
	@RequestMapping("/showName")
	@ResponseBody  //代表返回值是输出的部分，不加则是页面
	public String showName(){
		return userService.getName();
	}
}
