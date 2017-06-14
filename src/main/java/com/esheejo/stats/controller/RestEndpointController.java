package com.esheejo.stats.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esheejo.stats.model.User;
import com.esheejo.stats.service.UserService;

@RestController
@RequestMapping(path = "/statsmaster/user")
public class RestEndpointController {

	@RequestMapping(
			value = "/add",
			method = RequestMethod.POST)
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email, @RequestParam String username) {
		User n = new User();
		n.setUserName(username);
		n.setName(name);
		n.setEmail(email);
		userRepository.save(n);
		return "Saved";
	}

	@RequestMapping(
			value = "/user",
			method = RequestMethod.GET)
	public @ResponseBody Iterable<User> getUserById(@RequestParam Integer id) {
		return userRepository.getUserById(id);
	}
	
	@GetMapping(path = "/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return userRepository.getAllUsers();
	}
	
	@Autowired 
	private UserService userRepository;

}
