package com.petstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petstore.entities.Employer;

@Repository
public interface EmployerRepository extends JpaRepository<Employer, Integer> {

	Employer findByName(String name);
	
	
}
