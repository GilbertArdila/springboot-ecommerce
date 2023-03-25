package com.relationships.demo.service;

import com.relationships.demo.entity.Order;

import java.util.List;
import java.util.Optional;

public interface IorderService {
    Order save(Order order);
   List<Order> findAll();

   Optional<Order> fidnById(Long id);



    void delete(Long id);
}
