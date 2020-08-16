package com.springboot.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public ModelAndView indexPage() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/index",method = RequestMethod.GET)
	public ModelAndView indexPage1() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="/publicPage2",method=RequestMethod.GET)
	public ModelAndView publicPage2() {
		return new ModelAndView("publicPage2");
	}
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public ModelAndView userPage() {
		return new ModelAndView("user");
	}
	
	@RequestMapping(value="/admin",method=RequestMethod.GET)
	public ModelAndView adminPage() {
		return new ModelAndView("admin");
	}
	
	@RequestMapping(value="/loginPage",method=RequestMethod.GET)
	public ModelAndView loginPage() {
		return new ModelAndView("loginPage");
	}
	
}
