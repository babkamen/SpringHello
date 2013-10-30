package org.geymer.user.dao;

import java.util.List;

import org.geymer.user.entity.User;

public interface UserDAO {
 void addUser(User user);
void deleteUser(Integer id);
List<User> getUsers();
User getUser(Integer id);
void editUser(User user);
}
