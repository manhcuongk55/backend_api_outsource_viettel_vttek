package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import vn.vttek.elecs.entities.Account;
import vn.vttek.elecs.entities.File;

import javax.transaction.Transactional;

@Transactional
public interface FileRepository extends CrudRepository<File,Integer>{
    
}
