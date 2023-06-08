package com.petstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petstore.entities.Telephone;

public interface TelephoneRepository extends JpaRepository<Telephone, Integer>{

	Telephone findByNumber(String number);


}
