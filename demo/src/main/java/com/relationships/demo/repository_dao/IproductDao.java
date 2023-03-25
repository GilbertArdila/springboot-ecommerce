package com.relationships.demo.repository_dao;

import com.relationships.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IproductDao extends JpaRepository<Product,Long> {
}
