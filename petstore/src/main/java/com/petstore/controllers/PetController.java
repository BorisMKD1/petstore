package com.petstore.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.petstore.entities.Customer;
import com.petstore.entities.Pet;
import com.petstore.services.CustommerService;
import com.petstore.services.PetService;

@RestController
@RequestMapping("/pets")
public class PetController {
	
	@Autowired
	private PetService petService;
	@Autowired
	private CustommerService custommerService;
	
	@GetMapping("/find-by-id/{id}")
	public Pet findPetbyId(@PathVariable("id") Integer id) {
		return petService.findById(id);
	}
	
	@GetMapping("/find-by-name/{name}")
	public Pet findPetbyId(@PathVariable("name") String name) {
		return petService.findByName(name);
	}
	
	@PostMapping("/insert")
	public Pet findPetbyId(@RequestBody Pet pet) {
		return petService.savePet(pet);
	}
	
	@PutMapping("/{id}")
	public Pet updatePet(@RequestBody Pet pet, @PathVariable("id") Integer id) {
		return petService.updatePet(pet, id);
	}
	
	@DeleteMapping("{id}")
	public void deletePet(@PathVariable("id") Integer id) {
		petService.deletePet(id);
	}

	@PutMapping("/set-owner") 
	public void getPetForCustomer(@RequestParam("customer") Integer customer, @RequestParam("pet") Integer petId) {
		Pet pet = petService.findById(petId);
		Customer owner = custommerService.findById(customer);
		pet.setOwner(owner);
		petService.updatePet(pet, petId);
	}
}
