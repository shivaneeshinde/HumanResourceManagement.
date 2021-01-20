package com.hrm.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.hrm.employee.entity.Employee;
import com.hrm.employee.entity.Leaves;
import com.hrm.employee.service.EmployeeService;
/*import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;*/


@org.springframework.web.bind.annotation.RestController
//@Controller
public class RestController {
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/healthCheck")
	public String check()
	{
		return "checked";
	}
	
	@GetMapping("/addEmployee")
	public String registration() {
	    System.out.println("Inside Registration method");
	    Employee employee = new Employee(1, "Shivanee", "Mumbai", "Female", "123445", "shivanee@gmail.com", "1996-07-07", "pic", "test1234","Developer", "Lifters", 3000.5);
		System.out.println("Object created");
		employeeService.addEmployee(employee);
		return "Employee added to the table!!";
	}
	
	
	@GetMapping("/addLeaves")
	public String addLeaves() {
	    System.out.println("Inside Registration method");
	    Leaves leaves = new Leaves(1, "Sick Leave", "2021-01-01", "2021-01-11", "need leave bcoz not feeling well", 10);
		System.out.println("Object created");
		employeeService.addLeaves(leaves);
		return "Leaves are added to the table!!";
	}

}
