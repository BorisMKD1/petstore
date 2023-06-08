package com.petstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petstore.entities.Telephone;
import com.petstore.repository.TelephoneRepository;

@Service
public class TelephoneService {

	@Autowired
	private TelephoneRepository telephoneRepository;

	public Telephone findByNumber(String number) {
		return telephoneRepository.findByNumber(number);
	}

	public Telephone insertPhone(Telephone telephone) {
		if(telephone.getCustomer()!=null) {
			telephone.getCustomer().setTelephone(telephone);
		}
		return telephoneRepository.save(telephone);
	}

	
}
