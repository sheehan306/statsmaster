package com.esheejo.stats.service;

import com.esheejo.stats.model.User;

public interface UserService {

	public Iterable<User> getAllUsers();

	public void save(User n);
	
}
