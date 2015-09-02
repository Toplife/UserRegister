package com.david.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.david.DBUtil.DBUtils;
import com.david.model.User;

public class UserDao {
	
	public void add(User user) {
		String userId = user.getUserId();
		String userName = user.getUserName();
		int age = user.getAge();
		String sql = "insert into USERTABEL values('" + userId + "','"+userName+"','"+age+"')";
		DBUtils.executeUpdate(sql);
		DBUtils.close();
		
	}
	
public List<User> getAll() {
		
		String sql = "select * from USERTABEL order BY USERID";
		
		List<User> userList = new ArrayList<>();
		String userid = null;
		String username = null;
		int  age = 0;
		
		ResultSet rs = DBUtils.executeQuery(sql);
		try {
			
			while(rs.next()) {
				userid = rs.getString(1);
				username = rs.getString(2);
				age = Integer.parseInt(rs.getString(3));
				userList.add(new User(userid,username,age));
			}
			return userList;
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		}
		finally {
			DBUtils.close();
		}
	}

	public void modify(User user) {
		String userid = user.getUserId();
		String username = user.getUserName();
		int age = user.getAge();
		String sql = "update USERTABEL set USERNAME = '" + username + "', AGE = " + age + " where userid = '" + userid + "'";
		DBUtils.executeUpdate(sql);
		DBUtils.close();
	}
	
	public User get(String userid) {
		
		String username = null;
		int age = 0;
		String sql = "select * from USERTABEL where USERID = '" + userid + "'";
		
		ResultSet rs = DBUtils.executeQuery(sql);
		try {
			if(rs.next()) {
				userid = rs.getString(1);
				username = rs.getString(2);
				age = Integer.parseInt(rs.getString(3));
				return new User(userid,username,age);
			}
			else {
				return null;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		}
		finally {
			DBUtils.close();
		}
	}

}
