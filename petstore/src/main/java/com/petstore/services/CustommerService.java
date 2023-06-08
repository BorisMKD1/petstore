package com.petstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petstore.entities.Customer;
import com.petstore.repository.CustommerRepository;

@Service
public class CustommerService {

	@Autowired
	private CustommerRepository custommerRepository;

	public Customer findById(Integer id) {
		return custommerRepository.findById(id).get();
	}

	public Customer insertCustomer(Customer customer) {
		return custommerRepository.save(customer);
	}
	
	public Customer findByNameAndLastName(String name, String lastName) {
		return custommerRepository.findByNameAndLastName(name, lastName);
	}
	
}
