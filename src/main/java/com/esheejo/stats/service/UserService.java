package com.esheejo.stats.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import com.esheejo.stats.model.User;

public interface UserService extends CrudRepository<User, Long>  {

}
