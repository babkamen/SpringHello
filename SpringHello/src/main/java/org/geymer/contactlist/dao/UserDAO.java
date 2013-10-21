package org.geymer.contactlist.dao;

import java.util.List;

import org.geymer.contactlist.entity.User;

public interface UserDAO {
 void addUser(User user);
void deleteUser(Integer id);
List<User> getUsers();
User getUser(Integer id);
}
