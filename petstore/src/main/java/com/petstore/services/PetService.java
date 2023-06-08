package com.petstore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petstore.entities.Pet;
import com.petstore.repository.PetRepository;

@Service
public class PetService {

	@Autowired
	private PetRepository petRepository;

	public Pet findById(Integer id) {
		return petRepository.findById(id).get();
	}

	public Pet savePet(Pet pet) {
		return petRepository.save(pet);
	}

	public Pet findByName(String name) {
		return petRepository.findByName(name);
	}

	public Pet updatePet(Pet pet, Integer id) {
		Pet petOdBaza = petRepository.findById(id).get();
		petOdBaza.setType(pet.getType());
		petOdBaza.setName(pet.getName());
		petOdBaza.setOwner(pet.getOwner());
		return petRepository.save(petOdBaza);
	}

	public void deletePet(Integer id) {
		petRepository.deleteById(id);
	}
}
