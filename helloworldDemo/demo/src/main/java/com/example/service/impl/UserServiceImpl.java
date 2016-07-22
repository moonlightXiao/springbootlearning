package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserDAO;
import com.example.pojo.User;
import com.example.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public String getById(Long userId) {
		return userDAO.getById(userId);
	}

	@Override
	public List<User> getAllUsers() {
		return userDAO.getAllUsers();
	}

}
