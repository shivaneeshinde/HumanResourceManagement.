package com.hrm.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hrm.employee.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("from Employee where EmailId = ?1 and EmPaasword = ?2")
	List<Employee> findByEmailIdAndEmPaasword(String EmailId, String EmPaasword);

	Employee findTopByOrderByEmpIdDesc();
	
	Employee findByempId(int empId);
	
	void deleteByempId(int empId);

}
