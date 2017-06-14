package com.esheejo.stats.service;

import java.util.List;

import com.esheejo.stats.model.User;

public interface UserService {

	public Iterable<User> getAllUsers();

	public void save(User n);

	public List<User> getUserById(Integer id);
	
}
