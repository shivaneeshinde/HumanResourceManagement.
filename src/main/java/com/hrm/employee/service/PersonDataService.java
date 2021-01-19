package com.hrm.employee.service;

import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

import com.hra.employee.repository.PersonDataRepository;
import com.hrm.employee.entity.PersonData;

@Service
@Transactional
public class PersonDataService {
	private final PersonDataRepository personDataRepository;
	
	public PersonDataService(PersonDataRepository personDataRepository) {
		this.personDataRepository = personDataRepository;
	}

	public void addEmployee(PersonData personData) {
		System.out.println("Inside addEmployee");
		personDataRepository.save(personData);
		System.out.println("SAVED!!!");
	}
	
}
