package com.training.springboot.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Transactional
@Table(name = "USER44")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	
	@Column(name="first_name", nullable=false)
	private String firstName;
	
	@Column(name="last_name", nullable=false)
		
	private String lastName;
	
	private int age;
	private char gender;
	
	@OneToOne(mappedBy = "user", cascade=CascadeType.ALL)
	private Address address;
	
	public User(String firstName, String lastName, int age, char gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
	}
	
	
	
}
