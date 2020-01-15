package com.surbhi.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.surbhi.data.UserDAOImpl;
import com.surbhi.model.User;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDAOImpl userUtil=null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String COMMAND=request.getParameter("COMMAND");
			switch(COMMAND) {
			case "ADD":addUser(request,response);
			break;
			case "USER":getUser(request,response);
			break;
			case "LOGOUT":
				logOut(request, response);
				break;


			}
		}
		catch(Exception e) {
			throw new ServletException(e);
		}
		
	}

	
	private void logOut(HttpServletRequest request, HttpServletResponse response)throws Exception {

		HttpSession session=request.getSession();
			session.invalidate();
			String message="Log out successfully";
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			request.setAttribute("msg",message);
			rd.forward(request,response);
		
	}


	private void getUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String userId=request.getParameter("userId");
		String password=request.getParameter("password");
		String resource="login.jsp";
		String message=null;
		System.out.println(userId +"  "+password);
		try {
			User user=userUtil.getUser(userId);
			System.out.println(user);
		
			if(user.getPassword().equals(password) && user.getType().equals("Student")) {
				HttpSession session=request.getSession();
				//session.setMaxInactiveInterval(400);
				session.setAttribute("user",user);
				resource="AccountantController";
			}
			else if(user.getPassword().equals(password) && user.getType().equals("Accountant")) {
				HttpSession session=request.getSession();
				//session.setMaxInactiveInterval(400);
				session.setAttribute("user",user);
				resource="StudentController";
			}
			else {
				message="Invalid Password : Try Again";
			}
		}
		catch(Exception e) {
			message=e.getMessage();
			System.out.println(message);
		}
		RequestDispatcher rd=request.getRequestDispatcher(resource);
		request.setAttribute("msg", message);
		rd.forward(request, response);
		
	}


	private void addUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String userId=request.getParameter("userId");
		String userName=request.getParameter("name");
		String password=request.getParameter("password");
		String resource="registration.jsp";
		String message=null;
		User user=new User(userId,password,userName);
		try {
			userUtil.addUser(user);
			message="Registration Successfully : Please Login";
			resource="login.jsp";
		}
		catch(Exception e) {
			message=e.getMessage();
		}
		RequestDispatcher rd=request.getRequestDispatcher(resource);
		request.setAttribute("msg", message);
		rd.forward(request, response);
	}

	
	public void init() throws ServletException {
		super.init();
		userUtil=new UserDAOImpl();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
