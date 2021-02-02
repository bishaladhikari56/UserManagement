package com.vastika.UserManagement.dao;

import java.util.List;

import com.vastika.UserManagement.model.User;

public interface UserDao 
{
	int saveUser(User user);
	int updateUser(User user);
	int deleteUser(int id);
	User getUserById(int id);
	List<User> getAllUser();
	
}
