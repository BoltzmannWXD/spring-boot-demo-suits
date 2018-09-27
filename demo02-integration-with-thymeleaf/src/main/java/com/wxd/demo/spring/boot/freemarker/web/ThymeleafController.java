package com.wxd.demo.spring.boot.freemarker.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("msg", "Thymeleaf");
		return "/index";
	}
	
}
