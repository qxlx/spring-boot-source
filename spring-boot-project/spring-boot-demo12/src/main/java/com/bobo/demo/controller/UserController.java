package com.bobo.demo.controller;

import com.bobo.demo.event.MyEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	ApplicationContext context;

	@GetMapping("/hello")
	public String hello(){
		// 发布一个 自定义事件
		context.publishEvent(new MyEvent(new Object()));
		return "hello";
	}
}
