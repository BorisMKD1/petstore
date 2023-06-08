package com.petstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petstore.entities.Customer;
import com.petstore.services.CustommerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustommerService custommerService;

	@GetMapping("/find-by-id/{id}")
	public Customer findCustomerbyId(@PathVariable("id") Integer id) {
		return custommerService.findById(id);
	}
	
	@GetMapping("/find-by-name-lastname/{name}/{lastName}")
	public Customer findByNameAndLastName(@PathVariable("name") String name, @PathVariable("lastName") String lastName) {
		return custommerService.findByNameAndLastName(name, lastName);
	}
	
	@PostMapping("/insert")
	public Customer insertCutomer(@RequestBody Customer customer) {
		return custommerService.insertCustomer(customer);
	}

}
