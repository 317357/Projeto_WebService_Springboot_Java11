package com.projeto_Web.Projeto_WebService.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto_Web.Projeto_WebService.entities.Category;
import com.projeto_Web.Projeto_WebService.repositories.CategoryRepository;


@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();	
	}
	public Category findBydId(Long Id) {
		Optional<Category> obj= repository.findById(Id);
		return obj.get();
	}

}
