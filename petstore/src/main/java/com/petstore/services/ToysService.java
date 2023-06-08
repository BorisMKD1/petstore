package com.petstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petstore.entities.Toys;
import com.petstore.repository.ToysRepository;

@Service
public class ToysService {
	
	@Autowired
	private  ToysRepository toysRepository;
	
	public Toys getToysByName (String name) {
		return toysRepository.findByToyName(name);
	}

	
public Toys insertToys(Toys toys) {
	return toysRepository.save(toys);
}



}
