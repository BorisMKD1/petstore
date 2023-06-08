package com.petstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petstore.entities.Address;
import com.petstore.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;

	public Address findById(Integer id) {
		return addressRepository.findById(id).get();
	}

	public Address insertAddress(Address address) {
		return addressRepository.save(address);
	}

	
}
