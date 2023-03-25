package com.relationships.demo.service;

import com.relationships.demo.entity.User;
import java.util.List;
import java.util.Optional;

public interface IuserService {
    User save(User user);
   List<User> findAll();

   Optional<User> fidnById(Long id);

   User update(User newData,Long id);

    void delete(Long id);
}
