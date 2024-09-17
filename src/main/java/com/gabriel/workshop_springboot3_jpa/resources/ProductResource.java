package com.gabriel.workshop_springboot3_jpa.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.workshop_springboot3_jpa.entities.Product;
import com.gabriel.workshop_springboot3_jpa.entities.User;
import com.gabriel.workshop_springboot3_jpa.services.ProductService;
import com.gabriel.workshop_springboot3_jpa.services.UserService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> u = service.findAll();
		return ResponseEntity.ok().body(u);
				
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
}