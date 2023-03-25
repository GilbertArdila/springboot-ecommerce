package com.relationships.demo.service;

import com.relationships.demo.entity.User;
import com.relationships.demo.repository_dao.IuserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements IuserService {
    @Autowired
      private IuserDao repository;

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<User> fidnById(Long id) {
        if(repository.findById(id).isPresent()) {
            return repository.findById(id);
        }
        return null;
    }


    public User update(User newData, Long id) {
        if(this.repository.findById(id).isPresent()){
            Optional<User> actualData= this.fidnById(id);

            actualData.map(actual ->{
                if (newData.getName() != null){
                    actual.setName(newData.getName());
                }
                if (newData.getUserName() != null){
                    actual.setUserName(newData.getUserName());
                }
                if (newData.getPassword() != null){
                    actual.setPassword(newData.getPassword());
                }
                if (newData.getEmail() != null){
                    actual.setEmail(newData.getEmail());
                }
                if (newData.getPhone() != null){
                    actual.setPhone(newData.getPhone());
                }
                if (newData.getAddress() != null){
                    actual.setAddress(newData.getAddress());
                }
                if (newData.getType() != null){
                    actual.setType(newData.getType());
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
