package com.wzh.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wzh.demo.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	//注解写在实现类中
	public String getName() {
		// TODO Auto-generated method stub
		return "-----------------i am 服务者---------------------";
	}
	
}
