package com.petstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.petstore.entities.Toys;

@Repository
public interface ToysRepository extends JpaRepository<Toys, Integer> {
	
	Toys findByToyName(String toysName);

}
