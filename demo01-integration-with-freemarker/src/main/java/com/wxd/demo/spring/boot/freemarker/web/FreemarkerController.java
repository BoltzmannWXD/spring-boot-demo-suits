package com.wxd.demo.spring.boot.freemarker.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreemarkerController {

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("msg", "Freemarker");
		return "/index";
	}
	
}
