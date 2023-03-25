package com.relationships.demo.service;

import com.relationships.demo.entity.Product;

import java.util.List;
import java.util.Optional;

public interface IproductService {
    Product save(Product product);
   List<Product> findAll();

   Optional<Product> fidnById(Long id);

   Product update(Product newData,Long id);

    void delete(Long id);
}
