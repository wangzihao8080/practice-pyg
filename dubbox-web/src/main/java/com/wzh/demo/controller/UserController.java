package com.wzh.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wzh.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	//Զ��ע��ע��
	@Reference
	private UserService userService;
	
	@RequestMapping("/showName")
	@ResponseBody  //������ֵ������Ĳ��֣���������ҳ��
	public String showName(){
		return userService.getName();
	}
}
