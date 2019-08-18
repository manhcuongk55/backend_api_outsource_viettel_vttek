package vn.vttek.elecs.service;

import vn.vttek.elecs.entities.User_roles;
import vn.vttek.elecs.entities.Account;
import vn.vttek.elecs.repository.RoleRepository;
import vn.vttek.elecs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    
    @Override
    public Iterable<Account> listAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Account getUserByName(String username) {
        return userRepository.findOne(username);
    }

    @Override
    public Account saveUser(Account account) {
        User_roles roles = new User_roles(account.getUsername());
        roleRepository.save(roles);
        
        return userRepository.save(account);
    }

    @Override
    public void deleteUser(String username) {
        userRepository.delete(username);
    }
    
}
