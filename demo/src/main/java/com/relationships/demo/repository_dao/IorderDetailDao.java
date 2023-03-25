package com.relationships.demo.repository_dao;

import com.relationships.demo.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IorderDetailDao extends JpaRepository<OrderDetail,Long> {
}
