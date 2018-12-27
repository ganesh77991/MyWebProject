package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.EmployeeService;

@Controller
@RequestMapping("employee")
public class EmployeeController {
	
	EmployeeService service;
	
	@RequestMapping("testing")
	public String test() {
		
		return "registerEmp";
	}

}
