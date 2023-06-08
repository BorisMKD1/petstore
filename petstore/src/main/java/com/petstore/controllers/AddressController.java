package com.petstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petstore.entities.Address;
import com.petstore.services.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	private AddressService addressService;

	@GetMapping("/find-by-id/{id}")
	public Address findAddressById(@PathVariable("id") Integer id) {
		return addressService.findById(id);
	}
	
	@PostMapping("/insert")
	public Address insertAddress(@RequestBody Address address) {
		return addressService.insertAddress(address);
	}

}
