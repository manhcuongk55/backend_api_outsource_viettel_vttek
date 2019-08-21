package vn.vttek.elecs.repository;

import org.springframework.data.repository.CrudRepository;
import vn.vttek.elecs.entities.Account;
import vn.vttek.elecs.entities.GroupUser;

import javax.transaction.Transactional;

@Transactional
public interface GroupUserRepository extends CrudRepository<GroupUser,Integer>{
    
}
