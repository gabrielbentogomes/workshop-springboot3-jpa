package com.gabriel.workshop_springboot3_jpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.workshop_springboot3_jpa.entities.Category;
import com.gabriel.workshop_springboot3_jpa.entities.User;
import com.gabriel.workshop_springboot3_jpa.repositories.CategoryRepository;
import com.gabriel.workshop_springboot3_jpa.repositories.UserRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id){
		Optional<Category> category = repository.findById(id);
		return category.get();
	}
}
