package vn.vttek.elecs.repository;

import vn.vttek.elecs.entities.Account;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

@Transactional
public interface AccountRepository extends CrudRepository<Account,String>{
    
}
