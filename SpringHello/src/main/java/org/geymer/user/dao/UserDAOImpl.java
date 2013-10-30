package org.geymer.user.dao;

import java.util.List;





import org.geymer.user.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class UserDAOImpl implements UserDAO {

@Autowired
SessionFactory sessionFactory;
	
	@Override
	public void deleteUser(Integer id) {
		User u=(User)sessionFactory.getCurrentSession().load(User.class, id);
	if(u!=null)sessionFactory.getCurrentSession().delete(u);
	}

	
	@Override
	public List<User> getUsers() {
		return sessionFactory.getCurrentSession().createQuery("from Users").list();
	}
	
	@Override
	public User getUser(Integer id) {
		return (User)sessionFactory.getCurrentSession().get(User.class,id);
	}
	
	@Override
	public void addUser(User user) {
		sessionFactory.getCurrentSession().save(user);
	}


	@Override
	public void editUser(User user) {
		
		sessionFactory.getCurrentSession().update(user);
	}

}
