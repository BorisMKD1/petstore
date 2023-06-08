package com.petstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petstore.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{


}
