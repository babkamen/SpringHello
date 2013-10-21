package org.geymer.contactlist.service;

import java.util.List;

import org.geymer.contactlist.dao.UserDAOImpl;
import org.geymer.contactlist.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserManagerImpl implements UserManager {
	@Autowired
	UserDAOImpl userDao;

	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Override
	public void deleteUser(Integer id) {
		userDao.deleteUser(id);
	}

	@Override
	public List<User> getUsers() {
		return userDao.getUsers();
	}

	@Override
	public User getUser(Integer id) {
		return userDao.getUser(id);
	}

}
