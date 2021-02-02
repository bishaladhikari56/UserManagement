package com.vastika.UserManagement.service;

import java.util.List;

import com.vastika.UserManagement.dao.UserDao;
import com.vastika.UserManagement.dao.UserDaoImpl;
import com.vastika.UserManagement.model.User;

public class UserServiceImpl implements UserService
{
	UserDao userDao= new UserDaoImpl();
	@Override
	public int saveUser(User user) {
		
		return userDao.saveUser(user);
	}

	@Override
	public int updateUser(User user) {
		
		return userDao.updateUser(user);
	}

	@Override
	public int deleteUser(int id) {
		
		return userDao.deleteUser(id);
	}

	@Override
	public User getUserById(int id) {
		
		return userDao.getUserById(id);
	}

	@Override
	public List<User> getAllUser() {
		
		return userDao.getAllUser();
	}

}
