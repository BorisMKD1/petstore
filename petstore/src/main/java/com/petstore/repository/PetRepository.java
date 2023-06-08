package com.petstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petstore.entities.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer>{

	Pet findByName(String name);

}
