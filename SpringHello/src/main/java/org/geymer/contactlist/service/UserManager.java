package org.geymer.contactlist.service;

import java.util.List;

import org.geymer.contactlist.entity.User;
import org.springframework.transaction.annotation.Transactional;

public interface UserManager {
void addUser(User user);
	 void deleteUser(Integer id);
	 List<User> getUsers();
	 User getUser(Integer id);
}
