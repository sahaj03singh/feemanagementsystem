package com.surbhi.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.surbhi.data.AccountantDAOImpl;
import com.surbhi.model.Student;

/**
 * Servlet implementation class AccountantController
 */
@WebServlet("/AccountantController")
public class AccountantController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 AccountantDAOImpl  studentUtil;
	@Override
	public void init() throws ServletException {
		studentUtil=new AccountantDAOImpl();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {

			
		       String COMMAND=request.getParameter("COMMAND");
				if(COMMAND==null)
				{
					COMMAND="LIST";
				}
				switch(COMMAND) {
				case "LIST":
					listDetail(request,response);
					break;
				case "SEARCH":
					searchDetail1(request,response);
				case "LOGOUT":
					logOut(request, response);
					break;
					default:
						listDetail(request,response);
						break;
				}
				
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
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

	private void searchDetail1(HttpServletRequest request, HttpServletResponse response) throws Exception{
		int rollNo=Integer.parseInt(request.getParameter("theSearchStudent"));
		List<Student> DetailList=studentUtil.searchDetail1(rollNo);
		request.setAttribute("DETAIL_LIST", DetailList);
		RequestDispatcher rd=request.getRequestDispatcher("student-list.jsp");
		rd.forward(request, response);
		
		
	}

	private void listDetail(HttpServletRequest request, HttpServletResponse response) throws Exception{
		List<Student> detailList = studentUtil.getDetails();
		System.out.println(detailList);
		request.setAttribute("DETAIL_LIST",detailList);
		RequestDispatcher rd=request.getRequestDispatcher("student-list.jsp");
		rd.forward(request, response);
		
	}



	

}
