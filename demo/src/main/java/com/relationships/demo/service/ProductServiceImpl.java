package com.relationships.demo.service;

import com.relationships.demo.entity.Product;
import com.relationships.demo.repository_dao.IproductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IproductService {
    @Autowired
      private IproductDao repository;
    @Override
    public Product save(Product product) {
        return repository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }

    @Override
    public Optional<Product> fidnById(Long id) {
        return repository.findById(id);
    }


    public Product update(Product newData, Long id) {
        if(repository.findById(id).isPresent()){
          Optional<Product> actualData = this.fidnById(id);
          actualData.map(actual->{
              if(newData.getName() != null){
                  actual.setName(newData.getName());
              }
              if(newData.getPrice() != null){
                  actual.setPrice(newData.getPrice());
              }
              if(newData.getDescription() != null){
                  actual.setDescription(newData.getDescription());
              }
              if(newData.getDetails()!= null){
                  actual.setDetails(newData.getDetails());
              }
              if(newData.getImage()!= null){
                  actual.setImage(newData.getImage());
              }
              if(newData.getQuantity()!= null){
                  actual.setQuantity(newData.getQuantity());
              }
              return repository.save(actual);
          });


        }
        return null;
    }

    @Override
    public void delete(Long id) {
       if(repository.findById(id).isPresent()){
           repository.deleteById(id);
       }
    }
}
