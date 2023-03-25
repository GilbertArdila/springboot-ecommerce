package com.relationships.demo.service;

import com.relationships.demo.entity.OrderDetail;
import com.relationships.demo.repository_dao.IorderDetailDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class OrderDetailServiceImpl implements IorderDetailService {
    @Autowired
      private IorderDetailDao repository;

    @Override
    public OrderDetail save(OrderDetail detail) {
        return repository.save(detail);
    }



    @Override
    public void delete(Long id) {
        if(repository.findById(id).isPresent()){
            repository.deleteById(id);
        }
    }
}
