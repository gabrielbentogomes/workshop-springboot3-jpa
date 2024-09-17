package com.gabriel.workshop_springboot3_jpa.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.workshop_springboot3_jpa.entities.Order;
import com.gabriel.workshop_springboot3_jpa.entities.User;
import com.gabriel.workshop_springboot3_jpa.services.OrderService;
import com.gabriel.workshop_springboot3_jpa.services.UserService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> u = service.findAll();
		return ResponseEntity.ok().body(u);
				
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
}