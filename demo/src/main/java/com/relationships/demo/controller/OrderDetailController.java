package com.relationships.demo.controller;

import com.relationships.demo.entity.OrderDetail;
import com.relationships.demo.service.OrderDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/details")
public class OrderDetailController {
    @Autowired
    OrderDetailServiceImpl service;



    @PostMapping("/")
    public OrderDetail save(@RequestBody OrderDetail detail){
        return service.save(detail);
    }



    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Long id){
        service.delete(id);
    }

}
