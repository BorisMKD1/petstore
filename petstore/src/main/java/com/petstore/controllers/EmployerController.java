package com.petstore.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petstore.entities.Employer;
import com.petstore.services.EmployerService;

@RestController
@RequestMapping("/employer")
public class EmployerController {
	@Autowired
	private EmployerService service;
	
	@GetMapping("/findByName/{name}")
	public Employer findByGjuro(@PathVariable("name") String name) {
		return service.getEmployerByName(name);
	}
	
	@PostMapping("/insert")
	public Employer insertEmployer(@RequestBody Employer emp) {
		return service.insertEmployer(emp);
	}

}
