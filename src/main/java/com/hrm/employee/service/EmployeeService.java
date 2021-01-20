package com.hrm.employee.service;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

import com.hrm.employee.entity.Employee;
import com.hrm.employee.entity.Leaves;
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
	
}
