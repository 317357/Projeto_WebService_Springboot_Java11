package com.projeto_Web.Projeto_WebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto_Web.Projeto_WebService.entities.Order;

public interface OrderRepository  extends JpaRepository<Order,Long>{

}
