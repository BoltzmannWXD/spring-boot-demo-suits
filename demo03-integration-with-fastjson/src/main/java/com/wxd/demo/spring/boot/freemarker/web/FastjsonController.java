package com.wxd.demo.spring.boot.freemarker.web;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wxd.demo.spring.boot.freemarker.entity.User;

@RestController
public class FastjsonController {

	@RequestMapping("/")
	public User home() {
		User user = new User();
		user.setId(10);
		user.setUsername("boltzmann");
		user.setPassword("good123");
		user.setBirthday(new Date());
		return user;
	}
	
}
