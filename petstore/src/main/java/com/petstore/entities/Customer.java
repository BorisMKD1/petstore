package com.petstore.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private String name;
	private String lastName;
	//Eden korsinik moze da ima prijavno poveke adresi
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "customer_address",
			joinColumns = {
					@JoinColumn(name="id_customer")
			},inverseJoinColumns = {@JoinColumn(name="id_address")})
	private List<Address> address;
	
	@OneToMany(mappedBy = "owner")
	@JsonIgnoreProperties(value = "owner")
	private List<Pet> pet;
	
	@OneToOne
	@JsonIgnoreProperties(value = "customer")
	private Telephone telephone;
	
}
