package com.group.Site2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class indexController {
	
	@RequestMapping("/")
	public String hello( @RequestParam(name="name", required=false, defaultValue="Никита") String name, Model model ) {
		
		model.addAttribute("name", name);
		
		return "hello";
	}

}
