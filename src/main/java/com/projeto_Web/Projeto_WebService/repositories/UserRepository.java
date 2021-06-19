package com.projeto_Web.Projeto_WebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto_Web.Projeto_WebService.entities.User;

public interface UserRepository  extends JpaRepository<User,Long>{

	

	
}
