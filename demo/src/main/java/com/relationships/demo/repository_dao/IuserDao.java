package com.relationships.demo.repository_dao;

import com.relationships.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IuserDao extends JpaRepository<User,Long> {
}
