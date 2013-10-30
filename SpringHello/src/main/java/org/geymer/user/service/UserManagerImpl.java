package org.geymer.user.service;

import java.util.List;

import org.geymer.user.dao.UserDAO;
import org.geymer.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserManagerImpl implements UserManager {
	@Autowired
	UserDAO userDAO;
	@Transactional
	@Override
	public void addUser(User user) {
		userDAO.addUser(user);
	}
	@Transactional
	@Override
	public void deleteUser(Integer id) {
		userDAO.deleteUser(id);
	}
	@Transactional
	@Override
	public List<User> getUsers() {
		return userDAO.getUsers();
	}
	@Transactional
	@Override
	public User getUser(Integer id) {
		return userDAO.getUser(id);
	}
	@Override
	public void editUser(User user) {
		userDAO.editUser(user);
		
	}
	

}
