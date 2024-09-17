package com.gabriel.workshop_springboot3_jpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.workshop_springboot3_jpa.entities.Order;
import com.gabriel.workshop_springboot3_jpa.entities.User;
import com.gabriel.workshop_springboot3_jpa.repositories.OrderRepository;
import com.gabriel.workshop_springboot3_jpa.repositories.UserRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id){
		Optional<Order> order = repository.findById(id);
		return order.get();
	}
}
