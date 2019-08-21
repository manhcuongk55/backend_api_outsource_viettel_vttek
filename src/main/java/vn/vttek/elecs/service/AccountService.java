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
public interface AccountService {
    public Iterable<Account> listAllAccounts();
	
    public Account getAccountByName(String username);

    public Account saveAccount(Account account);

    public void deleteAccount(String username);
    
}
