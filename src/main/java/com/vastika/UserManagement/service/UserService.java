package com.vastika.UserManagement.service;

import java.util.List;

import com.vastika.UserManagement.model.User;

public interface UserService
{
	int saveUser(User user);
	int updateUser(User user);
	int deleteUser(int id);
	User getUserById(int id);
	List<User> getAllUser();
}
