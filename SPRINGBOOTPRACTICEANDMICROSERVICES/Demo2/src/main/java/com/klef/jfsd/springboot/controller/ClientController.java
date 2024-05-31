package com.klef.jfsd.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("demo2")
public class ClientController 
{
	@GetMapping("/") 
	@ResponseBody
	public String admin()
	{
		return "Demo2 Microservice";
	}
}
