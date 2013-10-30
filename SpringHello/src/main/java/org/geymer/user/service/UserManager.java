package org.geymer.user.service;

import java.util.List;

import org.geymer.user.entity.User;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public interface UserManager {
void addUser(User user);
	 void deleteUser(Integer id);
	 List<User> getUsers();
	 User getUser(Integer id);
	 void editUser(User user);
}
