package com.springboot.controllers;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageErrorController implements ErrorController {

	@Override
	public String getErrorPath() {
		return "null";
	}
	
	@RequestMapping(value="/error")
	public String errorPages(HttpServletRequest request){
		int errorCode;
		errorCode = Integer.parseInt(request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE).toString());
		
		switch(errorCode) {
		case 403:
			return "errors/403";
		case 404:
			return "errors/404";
		case 500:
			return "errors/500";
		}
		return null;
	}

}
