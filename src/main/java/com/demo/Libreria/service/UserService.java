/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.Libreria.service;

import com.demo.Libreria.entities.Users;

/**
 *
 * @author Master
 */
public interface UserService {
    public Iterable<Users> listAllUsers();
	
    public Users getUserByName(String username);

    public Users saveUser(Users users);

    public void deleteUser(String username);
    
}
