package com.demo.Libreria.repository;

import com.demo.Libreria.entities.Book;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface BookRepository extends CrudRepository<Book,Integer>{
    
}
