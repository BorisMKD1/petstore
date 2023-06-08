package com.petstore.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.petstore.entities.Customer;

public interface CustommerRepository extends JpaRepository<Customer, Integer>{

	@Query(value = "select c from Customer c where c.name = :name and c.lastName = :lastName")
	Customer findByNameAndLastName(@Param("name") String name, @Param("lastName")  String lastName);
	
	List<Customer> findByName(String name);


}
