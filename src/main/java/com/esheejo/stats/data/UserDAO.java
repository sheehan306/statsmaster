package com.esheejo.stats.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.transaction.Transactional;
import com.esheejo.stats.model.User;

@Repository
public interface UserDAO extends CrudRepository<User, Long>  {

	// Alternative to above one
    @Query("SELECT U FROM User U WHERE U.id IN :id")
    List<User> alternativeFindByIdIn(@Param("id") Integer id);
}
