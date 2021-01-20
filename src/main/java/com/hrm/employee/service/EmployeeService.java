package com.hrm.employee.service;

import java.util.List;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

import com.hrm.employee.entity.Employee;
import com.hrm.employee.entity.Leaves;
import com.hrm.employee.entity.Login;
import com.hrm.employee.repository.EmployeeRepository;
import com.hrm.employee.repository.LeavesRepository;

@Service
@Transactional
public class EmployeeService {
	private final EmployeeRepository employeeRepository;
	private final LeavesRepository leavesRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository,LeavesRepository leavesRepository) {
		this.employeeRepository = employeeRepository;
		this.leavesRepository = leavesRepository;
	}

	public void addEmployee(Employee employee) {
		System.out.println("Inside addEmployee");
		employeeRepository.save(employee);
		System.out.println("SAVED!!!");
	}
	
	public void addLeaves(Leaves leaves) {
		System.out.println("Inside addLeaves");
		leavesRepository.save(leaves);
		System.out.println("SAVED!!!");
	}
	
	
	public Employee login(Login login) {
		System.out.println("Inside login");
		List<Employee> emp = employeeRepository.findByEmailIdAndEmPaasword(login.getEmailId(), login.getPassword());
		
		System.out.println("Employee is: "+emp.toString());
		if(emp.size()==0)
			System.out.println("Invalid user");
		
		return emp.get(0);
	}
	
}
