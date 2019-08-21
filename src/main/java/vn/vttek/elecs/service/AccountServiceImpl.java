package vn.vttek.elecs.service;

import vn.vttek.elecs.entities.UserRoles;
import vn.vttek.elecs.entities.Account;
import vn.vttek.elecs.repository.RoleRepository;
import vn.vttek.elecs.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private RoleRepository roleRepository;
    
    @Override
    public Iterable<Account> listAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public Account getAccountByName(String username) {
        return accountRepository.findOne(username);
    }

    @Override
    public Account saveAccount(Account account) {
        UserRoles roles = new UserRoles(account.getUsername());
        roleRepository.save(roles);
        
        return accountRepository.save(account);
    }

    @Override
    public void deleteAccount(String username) {
        accountRepository.delete(username);
    }
    
}
