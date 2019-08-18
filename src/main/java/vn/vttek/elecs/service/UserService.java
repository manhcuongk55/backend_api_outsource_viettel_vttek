/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.vttek.elecs.service;

import vn.vttek.elecs.entities.Account;

/**
 *
 * @author Master
 */
public interface UserService {
    public Iterable<Account> listAllUsers();
	
    public Account getUserByName(String username);

    public Account saveUser(Account account);

    public void deleteUser(String username);
    
}
