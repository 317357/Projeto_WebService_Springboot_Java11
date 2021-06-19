package com.projeto_Web.Projeto_WebService.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto_Web.Projeto_WebService.entities.Product;
import com.projeto_Web.Projeto_WebService.repositories.ProductRepository;


@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findBydId(Long Id) {
		Optional<Product> obj = repository.findById(Id);
		return obj.get();
	}

}
