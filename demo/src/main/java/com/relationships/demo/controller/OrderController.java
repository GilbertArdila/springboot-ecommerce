package com.relationships.demo.controller;

import com.relationships.demo.entity.Order;
import com.relationships.demo.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderServiceImpl service;

    @GetMapping("/")
    public List<Order> getAll(){
        return  service.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Order> getById(@PathVariable("id") Long id){
        return  service.fidnById(id);
    }

    @PostMapping("/")
    public Order save(@RequestBody Order order){
        return service.save(order);
    }

    @PatchMapping("/{id}")
    public Order update(@PathVariable("id")Long id,@RequestBody Order newData){
        return service.update(newData,id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Long id){
        service.delete(id);
    }

}
