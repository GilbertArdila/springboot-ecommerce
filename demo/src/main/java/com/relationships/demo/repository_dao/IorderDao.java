package com.relationships.demo.repository_dao;

import com.relationships.demo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IorderDao extends JpaRepository<Order,Long> {
}
