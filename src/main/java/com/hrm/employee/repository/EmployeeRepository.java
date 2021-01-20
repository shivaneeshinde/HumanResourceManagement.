package com.hrm.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.hrm.employee.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	

}
