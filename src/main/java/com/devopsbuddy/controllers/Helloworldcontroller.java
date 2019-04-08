package com.devopsbuddy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Helloworldcontroller {
	
	@RequestMapping("/")
	public String sayhelloworld () {
		return "index";
	}
	}


