package com.hra.employee.repository;

import org.springframework.data.repository.CrudRepository;

import com.hrm.employee.entity.PersonData;

public interface PersonDataRepository extends CrudRepository<PersonData, Integer> {
	

}
