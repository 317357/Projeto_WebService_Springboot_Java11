package com.projeto_Web.Projeto_WebService.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto_Web.Projeto_WebService.entities.User;
import com.projeto_Web.Projeto_WebService.repositories.UserRepository;
import com.projeto_Web.Projeto_WebService.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();	
	}
	public User findBydId(Long Id) {
		Optional<User> obj= repository.findById(Id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(Id));
	}
	
	public User insert(User obj){
		return repository.save(obj);
		
	}
	public void delete(Long id) {
		repository.deleteById(id);
	}
	public User update(Long id,User obj) {
		
		@SuppressWarnings("deprecation")
		User entity= repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
	}
	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}

}
