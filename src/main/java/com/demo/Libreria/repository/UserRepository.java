package com.demo.Libreria.repository;

import com.demo.Libreria.entities.Users;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface UserRepository extends CrudRepository<Users,String>{
    
}
