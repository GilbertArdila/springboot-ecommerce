package com.relationships.demo.controller;

import com.relationships.demo.entity.Product;
import com.relationships.demo.service.ProductServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductServiceImpl service;

    private final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @GetMapping("/")
    public List<Product> getAll(){
        return  service.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Product> getById(@PathVariable("id") Long id){
        return  service.fidnById(id);
    }

    @PostMapping("/")
    public Product save(@RequestBody Product product){
        LOGGER.info("Este es el producto enviado "+product);

        return service.save(product);
    }

    @PatchMapping("/{id}")
    public Product update(@PathVariable("id")Long id,@RequestBody Product newData){
        LOGGER.info("Estos son los datos actualizados "+newData);
        return service.update(newData,id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Long id){
        service.delete(id);
    }

}
