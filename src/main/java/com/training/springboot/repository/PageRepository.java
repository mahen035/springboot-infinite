package com.training.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.training.springboot.model.Page;

public interface PageRepository extends JpaRepository<Page, Long>{

}
