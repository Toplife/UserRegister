package com.david.service;

import java.util.List;

import com.david.dao.UserDao;
import com.david.model.User;

public class UserService {
	
	public void register(User user){
		UserDao userdao = new UserDao();
		userdao.add(user);
		//return flag;
	}
	public List<User> getAll() {
		UserDao dao = new UserDao();
		return dao.getAll();
	}
	
	public void updateUserInfo(User user){
		UserDao userdao = new UserDao();
		userdao.modify(user);
	}
	
	public User getUser(String userId){
		
		UserDao userdao = new UserDao();
		return userdao.get(userId);
		
	}
}
