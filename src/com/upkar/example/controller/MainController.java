package com.upkar.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView getMain(){
		return new ModelAndView("index");
	}

}