package com.hrm.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.hrm.employee.entity.PersonData;
import com.hrm.employee.service.PersonDataService;
/*import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;*/


@org.springframework.web.bind.annotation.RestController
//@Controller
public class RestController {
	
	@Autowired
	private PersonDataService personDataService;

	//@ResponseBody
	//@RequestMapping("/healthCheck")
	@GetMapping("/healthCheck")
	public String check()
	{
		return "checked";
	}
	
	//@ResponseBody
	//@RequestMapping("/healthCheck")
	@GetMapping("/addEmployee")
	public String registration() {
	    System.out.println("Inside Registration method");
	    PersonData personData = new PersonData(1, "Shivanee", "Mumbai", "Female", "123445", "shivanee@gmail.com", "1996-07-07", "pic", "test1234","Developer", "Lifters", 3000.5);
		System.out.println("Object created");
		personDataService.addEmployee(personData);
		return "Employee added to the table!!";
	}
	

}
