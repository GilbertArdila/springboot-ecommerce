package com.relationships.demo.controller;

import com.relationships.demo.entity.User;
import com.relationships.demo.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserServiceImpl service;

    @GetMapping("/")
    public List<User> getAll(){
        return  service.findAll();
    }
    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable("id") Long id){
        return  service.fidnById(id);
    }

    @PostMapping("/")
    public User save(@RequestBody User user){
        return service.save(user);
    }

    @PatchMapping("/{id}")
    public User update(@PathVariable("id")Long id,@RequestBody User newData){
        return service.update(newData,id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id")Long id){
        service.delete(id);
    }

}
