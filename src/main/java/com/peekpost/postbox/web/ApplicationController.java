package com.peekpost.postbox.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
	
	@RequestMapping("/home")
	@ResponseBody
	public String homePage() {
		return "home";
	}

}
