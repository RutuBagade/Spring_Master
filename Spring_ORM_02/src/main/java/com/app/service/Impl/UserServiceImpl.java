package com.app.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserdao;
import com.app.model.User;
import com.app.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserdao dao;
	@Transactional
	@Override
	public int save(User user) {
		// TODO Auto-generated method stub
		return dao.save(user);
	}
	@Transactional
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
         dao.update(user);
	}
	@Transactional
	@Override
	public void delete(int userId) {
		// TODO Auto-generated method stub
		dao.delete(userId);

	}
	@Transactional(readOnly = true)
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return dao.getUserById(userId);
	}
	@Transactional(readOnly = true)
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return dao.getAllUsers();

	}

}
