package com.demo.Libreria.service;

import com.demo.Libreria.entities.User_roles;
import com.demo.Libreria.entities.Users;
import com.demo.Libreria.repository.RoleRepository;
import com.demo.Libreria.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository; 
    @Autowired
    private RoleRepository roleRepository; 
    
    @Override
    public Iterable<Users> listAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Users getUserByName(String username) {
        return userRepository.findOne(username);
    }

    @Override
    public Users saveUser(Users users) {
        User_roles roles = new User_roles(users.getUsername());
        roleRepository.save(roles);
        
        return userRepository.save(users);
    }

    @Override
    public void deleteUser(String username) {
        userRepository.delete(username);
    }
    
}
