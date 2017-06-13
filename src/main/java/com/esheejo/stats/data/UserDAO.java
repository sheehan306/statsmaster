package com.esheejo.stats.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import com.esheejo.stats.model.User;

@Repository
public interface UserDAO extends CrudRepository<User, Long>  {

}
