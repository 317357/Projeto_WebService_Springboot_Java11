package com.projeto_Web.Projeto_WebService.resources;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto_Web.Projeto_WebService.entities.Order;
import com.projeto_Web.Projeto_WebService.services.OrderService;

@RestController
@RequestMapping(value="/orders")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order>list= service.findAll();
		return ResponseEntity.ok(list);
		
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Order>findByid(@PathVariable Long id){
		Order obj=service.findByndId(id);
		return ResponseEntity.ok(obj);
	}

}
