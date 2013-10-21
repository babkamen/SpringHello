package org.geymer.contactlist.service;

import java.util.List;

import org.geymer.contactlist.entity.User;
import org.springframework.transaction.annotation.Transactional;

public interface UserManager {
@Transactional
void addUser(User user);
@Transactional
	 void deleteUser(Integer id);
@Transactional
	 List<User> getUsers();
@Transactional
	 User getUser(Integer id);
}
