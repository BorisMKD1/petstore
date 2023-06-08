package com.petstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petstore.entities.Telephone;
import com.petstore.services.TelephoneService;

@RestController
@RequestMapping("/telephone")
public class TelephoneController {
	
	@Autowired
	private TelephoneService telephoneService;
	
	@GetMapping("/by-phone-number/{number}")
	public Telephone getTelephoneByNumber(@PathVariable("number") String number) {
		return telephoneService.findByNumber(number);
	}
	
	@PostMapping
	public Telephone insertPhone(@RequestBody Telephone telephone) {
		return telephoneService.insertPhone(telephone);
	}

}
