package com.gabriel.workshop_springboot3_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.workshop_springboot3_jpa.entities.Category;
import com.gabriel.workshop_springboot3_jpa.entities.User;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
