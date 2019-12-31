package com.tcs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	@Autowired
    private JdbcTemplate template;
    
	@RequestMapping("/employee")
	public String employeeMethod(@RequestParam("no") Integer eno, @RequestParam("name") String name,
			@RequestParam("salary") Integer salary) {
		
		//System.out.println("Employee Details: "+eno+" "+name+" "+salary);
		
		template.update("insert into employee values(eno,name,salary)");
		
		System.out.println("Insertion Successful");
		
		return "index.jsp";

	}
}
