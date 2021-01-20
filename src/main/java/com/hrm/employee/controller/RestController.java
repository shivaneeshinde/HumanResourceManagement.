package com.hrm.employee.controller;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hrm.employee.entity.Employee;
import com.hrm.employee.entity.Leaves;
import com.hrm.employee.entity.Login;
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
	public String registration(@RequestBody Employee employee) {
	    System.out.println("Inside Registration method");
	    String originalInput = employee.getPassword();
	    String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
	    System.out.println("Encoded password is: "+encodedString);
	    employee.setPassword(encodedString);
	    //Employee employee = new Employee(2, "Shivanee", "Mumbai", "Female", "123445", "shivanee@gmail.com", "1996-07-07", "pic", "test1234","Developer", "Lifters", 3000.5, 3);
		System.out.println("Employee Object is: "+ employee.toString());
		employeeService.addEmployee(employee);
		return "Employee added to the table!!";
	}
	
	
	@GetMapping("/addLeaves")
	public String addLeaves(@RequestBody Leaves leaves) {
	    System.out.println("Inside addLeaves method");
	    //Leaves leaves = new Leaves(1, "Sick Leave", "2021-01-01", "2021-01-11", "need leave bcoz not feeling well", 10,"Pending","Processing");
		System.out.println("Leaves Object is: "+leaves.toString());
		employeeService.addLeaves(leaves);
		return "Leaves are added to the table!!";
	}
	

	@GetMapping("/login")
	public Employee login(@RequestBody Login login) {
	    System.out.println("Inside login method");
	    String originalInput = login.getPassword();
	    String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
	    System.out.println("Encoded password is: "+encodedString);
	    login.setPassword(encodedString);
		Employee emp = employeeService.login(login);
		return emp;
	}

}
