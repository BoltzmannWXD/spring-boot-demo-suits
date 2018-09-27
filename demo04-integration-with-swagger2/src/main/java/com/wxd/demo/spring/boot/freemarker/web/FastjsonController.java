package com.wxd.demo.spring.boot.freemarker.web;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wxd.demo.spring.boot.freemarker.entity.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@Api(value = "use FastJson to demo swagger2", tags = "test interface")
@RestController
public class FastjsonController {

	@ApiOperation("index page")
	@ApiImplicitParam(name = "index", value = "main page", dataType = "string", paramType = "query")
	@GetMapping("/")
	public User home() {
		User user = new User();
		user.setId(10);
		user.setUsername("boltzmann");
		user.setPassword("good123");
		user.setBirthday(new Date());
		return user;
	}
	
}
