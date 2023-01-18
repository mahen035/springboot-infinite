package com.training.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.training.springboot.model.User;

@RepositoryRestResource(path="employees")
public interface UserRepository extends JpaRepository<User, Long> {
	
	List<User> findByFirstName(@Param("firstName") String firstName);

}
