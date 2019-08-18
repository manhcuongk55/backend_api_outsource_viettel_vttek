package vn.vttek.elecs.repository;

import vn.vttek.elecs.entities.Account;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface UserRepository extends CrudRepository<Account,String>{
    
}
