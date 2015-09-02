package com.david.servelt;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.david.model.User;
import com.david.service.UserService;

public class UserServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String ff =req.getParameter("from");
		UserService us = new UserService();
		
		if(ff.equals("Register")){
			String userId = req.getParameter("userId");
			String userName = req.getParameter("UserName");
			String age = req.getParameter("userAge");
			us.register(new User(userId, userName, Integer.parseInt(age)));
			resp.sendRedirect("UserList.jsp");
		}else if(ff.equals("modifyuser")){
			String userid = req.getParameter("userid");
			String username = req.getParameter("username");
			int age1  = Integer.parseInt(req.getParameter("age"));
			us.updateUserInfo(new User(userid,username,age1));
			resp.sendRedirect("UserList.jsp");
		}
		
		
	}
	
}
