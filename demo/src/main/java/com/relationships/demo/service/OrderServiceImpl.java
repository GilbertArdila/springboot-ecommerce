package com.relationships.demo.service;

import com.relationships.demo.entity.Order;
import com.relationships.demo.repository_dao.IorderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OrderServiceImpl implements IorderService {
    @Autowired
      private IorderDao repository;

    @Override
    public Order save(Order order) {
        return repository.save(order);
    }

    @Override
    public List<Order> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Order> fidnById(Long id) {
        if(repository.findById(id).isPresent()) {
            return repository.findById(id);
        }
        return null;
    }


    public Order update(Order newData, Long id) {
        if(repository.findById(id).isPresent()){
            Optional<Order> actualData = this.repository.findById(id);
           actualData.map(actual->{
               if(newData.getUser() != null){
                   actual.setUser(newData.getUser());
               }
               if(newData.getDetails() != null){
                   actual.setDetails(newData.getDetails());
               }
               if(newData.getNumber() != null){
                   actual.setNumber(newData.getNumber());
               }
               if(newData.getCreatedAt() != null){
                   actual.setCreatedAt(newData.getCreatedAt());
               }
               if(newData.getGotAt() != null){
                   actual.setGotAt(newData.getGotAt());
               }
               if(newData.getTotal() != null){
                   actual.setTotal(newData.getTotal());
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
