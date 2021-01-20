package com.hrm.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hrm.employee.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	@Query("from Employee where EmailId = ?1 and EmPaasword = ?2")
	List<Employee> findByEmailIdAndEmPaasword(String EmailId, String EmPaasword);

}
