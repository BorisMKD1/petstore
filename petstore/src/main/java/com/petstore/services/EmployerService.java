package com.petstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petstore.entities.Employer;
import com.petstore.repository.EmployerRepository;

@Service
public class EmployerService {
	
	@Autowired
	private EmployerRepository employerRepository;
	
	public Employer getEmployerByName (String name) {
	return employerRepository.findByName(name);	
		
	}

	public Employer insertEmployer(Employer emp) {
		
		return employerRepository.save(emp);
	}


 
}
