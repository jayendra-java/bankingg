package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BasicController {
	
	
	@RequestMapping("abc")
	public String basic()
	{
		System.out.println("hello");
	//	ModelAndView mv=new ModelAndView("index.jsp");
		
		System.out.println("bye");
		System.out.println("hello world");
		System.out.println("hello world....commit and push");
		return "index.jsp";
	}

}
