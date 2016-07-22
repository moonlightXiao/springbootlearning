package com.example.service;

import java.util.List;

import com.example.pojo.User;

public interface UserService {
	public String getById(Long userId);
	
	public List<User> getAllUsers();
}
