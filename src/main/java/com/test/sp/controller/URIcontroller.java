package com.test.sp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class URIcontroller {
		
	@RequestMapping(value="/views/**",method =RequestMethod.GET)
	public String goPage(HttpServletRequest request) {
		return request.getRequestURI().substring(7);
	}
}
