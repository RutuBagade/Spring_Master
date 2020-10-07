package com.app.dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IUserdao;
import com.app.model.User;
@Repository
public class UserDaoImpl implements IUserdao {
	@Autowired
    private HibernateTemplate ht;
	
	@Override
	public int save(User user) {
		// TODO Auto-generated method stub
		return (Integer)ht.save(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		ht.update(user);
	}

	@Override
	public void delete(int userId) {
		// TODO Auto-generated method stub
		User user = new User();
		user.setUserId(userId);
		ht.delete(user);
	}

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		User user = ht.get(User.class, userId);
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> user = ht.loadAll(User.class);
		return user;

	}

}
