package com.lintori.rebyu.Services;

import com.lintori.rebyu.Entities.*;
import com.lintori.rebyu.Repository.UserRepository;
import java.util.List;

public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List <User> findAllUsers(){
        return this.userRepository.findAll();
    }

    public User findUser (String id){
        return this.userRepository.findById(id).orElse(null);
    }

    public void addUser (User user){
        this.userRepository.save(user);   
    }

    public void updateUser (User updatedUser, String id){
        User user = this.userRepository.findById(id).orElse(null);
        user.setName(updatedUser.getName());
        this.userRepository.save(user);
    }

    public void deleteUser(String id){
        this.userRepository.deleteById(id);
    }

    
    
}
