package org.geymer.contactlist.service;

import java.util.List;

import org.geymer.contactlist.dao.UserDAO;
import org.geymer.contactlist.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class UserManagerImpl implements UserManager {
	@Autowired
	UserDAO userDAO;

	@Override
	public void addUser(User user) {
		userDAO.addUser(user);
	}

	@Override
	public void deleteUser(Integer id) {
		userDAO.deleteUser(id);
	}

	@Override
	public List<User> getUsers() {
		return userDAO.getUsers();
	}

	@Override
	public User getUser(Integer id) {
		return userDAO.getUser(id);
	}

}
