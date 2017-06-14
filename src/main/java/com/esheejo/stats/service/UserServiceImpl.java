package com.esheejo.stats.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esheejo.stats.data.UserDAO;
import com.esheejo.stats.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;

	@Override
	public Iterable<User> getAllUsers() {
		return userDAO.findAll();
	}

	@Override
	public void save(User n) {
		userDAO.save(n);
	}

	@Override
	public List<User> getUserById(Integer id) {
		return userDAO.alternativeFindByIdIn(id);
	}
	
	
	
	
}
