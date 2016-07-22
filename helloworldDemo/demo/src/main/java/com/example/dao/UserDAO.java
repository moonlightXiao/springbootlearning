package com.example.dao;

import java.util.List;
import com.example.pojo.User;


public interface UserDAO {
	String getById(Long userId);
	
	public List<User> getAllUsers();
}
