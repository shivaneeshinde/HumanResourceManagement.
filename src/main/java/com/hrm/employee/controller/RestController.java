package com.hrm.employee.controller;

import java.util.Base64;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hrm.employee.entity.Employee;
import com.hrm.employee.entity.Leaves;
import com.hrm.employee.entity.Login;
import com.hrm.employee.exception.ResourceNotFoundException;
import com.hrm.employee.service.EmployeeService;
/*import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;*/


//@Controller
//@RequestMapping("/emp")
@CrossOrigin(origins = "http://hrms-hackathon.herokuapp.com")
@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	//@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/healthCheck")
	public String check()
	{
		return "checked";
	}

	@PostMapping("/addEmployee")
	public Employee registration(@RequestBody Employee employee) {
	    System.out.println("Inside Registration method");
	    String originalInput = employee.getPassword();
	    String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
	    System.out.println("Encoded password is: "+encodedString);
	    employee.setPassword(encodedString);
	    //Employee employee = new Employee("Shivanee", "Mumbai", "Female", "123445", "shivanee@gmail.com", "1996-07-07", "pic", "test1234","Developer", "Lifters", 3000.5, 3);
		System.out.println("Employee Object is: "+ employee.toString());
		Employee result = employeeService.addEmployee(employee);
		System.out.println("Employee added to the table!!");
		return result;
	}
	
	@PostMapping("/addLeaves")
	public String addLeaves(@RequestBody Leaves leaves) {
	    System.out.println("Inside addLeaves method");
	    //Leaves leaves = new Leaves(1, "Sick Leave", "2021-01-01", "2021-01-11", "need leave bcoz not feeling well", 10,"Pending","Processing");
		System.out.println("Leaves Object is: "+leaves.toString());
		employeeService.addLeaves(leaves);
		return "Leaves are added to the table!!";
	}
	
	@PostMapping("/login")
	public Employee login(@RequestBody Login login) throws ResourceNotFoundException {
	    System.out.println("Inside login method");
	    String originalInput = login.getPassword();
	    String encodedString = Base64.getEncoder().encodeToString(originalInput.getBytes());
	    System.out.println("Encoded password is: "+encodedString);
	    login.setPassword(encodedString);
		Employee emp = employeeService.login(login);
		return emp;
	}
	
	@GetMapping("/showEmployee/{empId}")
	public Employee showEmployee(@PathVariable("empId") int empId){
	    System.out.println("Inside showEmployee method");
		Employee emp = employeeService.getEmployee(empId);
		return emp;
	}
	
	
	@GetMapping("/showLeaves/{empId}")
	public List<Leaves> showLeaves(@PathVariable("empId") int empId){
	    System.out.println("Inside showLeaves method");
	    List<Leaves> leaves = employeeService.getLeaves(empId);
		return leaves;
	}
	
	@PutMapping("/editEmployee/{empId}")
	public Employee replaceEmployee(@RequestBody Employee employee, @PathVariable int empId) {
		Employee emp = employeeService.updateEmployee(employee, empId);
		return emp;
	}

	  @DeleteMapping("/deletEmployee/{empId}")
	  void deleteEmployee(@PathVariable("empId") int empId) {
		  System.out.println("Inside deleteEmployee method");
		  employeeService.deleteEmployee(empId);
	  }

	@GetMapping("/empList")
	public List<Employee> empList() {
	    System.out.println("Inside empList method");
		List<Employee> emp = employeeService.getEmpList();
		return emp;
	}

}
