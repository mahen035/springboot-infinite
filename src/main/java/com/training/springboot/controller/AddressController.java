package com.training.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.model.Address;
import com.training.springboot.repository.AddressRepository;

@RestController
public class AddressController {
	
	@Autowired
	AddressRepository repository;
	
	@PostMapping("/saveAddress")
	public ResponseEntity<String> saveAddress(@RequestBody Address address){
		repository.save(address);
		return ResponseEntity.ok("Data Saved");
				
	}

}
