package com.relationships.demo.service;

import com.relationships.demo.entity.OrderDetail;


public interface IorderDetailService {
    OrderDetail save(OrderDetail detail);

    void delete(Long id);
}
