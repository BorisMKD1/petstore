package com.petstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petstore.entities.Toys;
import com.petstore.services.ToysService;

@RestController
@RequestMapping("/toys")
public class ToysController {
	
	@Autowired
	private ToysService service;

	
	@GetMapping("/findByToys/{toys}")
	public Toys findByToys(@PathVariable("toys") String toys ) {
		return service.getToysByName(toys);
	}
	
	@PostMapping("/insert")
	public Toys insertToys(@RequestBody Toys toys) {
		return service.insertToys(toys);
	}
	

}
