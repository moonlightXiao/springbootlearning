package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.User;
import com.example.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/u/{id}")
	public String getUserById(@PathVariable Long id){
		return userService.getById(id);
	}
	
	@RequestMapping("/users")
	public List<User> getUsers(){
		return userService.getAllUsers();
	}

}
