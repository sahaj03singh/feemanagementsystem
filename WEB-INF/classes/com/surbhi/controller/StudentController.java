package com.surbhi.controller;

import java.io.IOException;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.surbhi.data.StudentDAOImpl;
import com.surbhi.model.Student;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
           StudentDAOImpl studentUtil;
         
	@Override
		public void init() throws ServletException {
			studentUtil=new StudentDAOImpl();
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
				case "ADD":
					addDetail(request,response);
					break;
				case "DELETE":
					deleteDetail(request,response);
					break;
				case "SEARCH":
					searchDetail(request,response);
				case "LOAD":
					loadDetail(request,response);
					break;
				case "UPDATE" :
					updateDetail(request,response);
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

	private void updateDetail(HttpServletRequest request, HttpServletResponse response)throws Exception {
	
		int rollNo =Integer.parseInt(request.getParameter("rollNo"));
		String name=request.getParameter("name");
		String email =request.getParameter("email");
		double due=Double.parseDouble(request.getParameter("due"));
		String contact=request.getParameter("contact");
		Student detail=new Student(rollNo, name,email, due, contact);
		studentUtil.updateDetail(detail);
		listDetail(request,response);
	}

	private void loadDetail(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int rollNo=Integer.parseInt(request.getParameter("rollNo"));
		Student detail=studentUtil.getDetail(rollNo);
		request.setAttribute("STUDENT",detail);
		RequestDispatcher rd=request.getRequestDispatcher("update-student.jsp");
		rd.forward(request, response);
		
		
	}

	private void searchDetail(HttpServletRequest request, HttpServletResponse response) throws Exception{
		int rollNo=Integer.parseInt(request.getParameter("theSearchStudent"));
		List<Student> DetailList=studentUtil.searchDetail(rollNo);
		request.setAttribute("STUDENT_LIST", DetailList);
		RequestDispatcher rd=request.getRequestDispatcher("Accountant-list.jsp");
		rd.forward(request, response);
		
	}

	private void deleteDetail(HttpServletRequest request, HttpServletResponse response) throws Exception{
		int rollNo=Integer.parseInt(request.getParameter("rollNo"));
	    studentUtil.deleteDetail(rollNo);
		listDetail(request,response);
		
	}
	private void listDetail(HttpServletRequest request, HttpServletResponse response) throws Exception{
		List<Student> detailList = studentUtil.getDetails();
//		System.out.println(detailList);
		request.setAttribute("STUDENT_LIST",detailList);
		RequestDispatcher rd=request.getRequestDispatcher("Accountant-list.jsp");
		rd.forward(request, response);
	}

	private void addDetail(HttpServletRequest request, HttpServletResponse response) throws Exception{
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String course=request.getParameter("course");
		String sex=request.getParameter("sex");
		double fee=Double.parseDouble(request.getParameter("fee"));
		double paid=Double.parseDouble(request.getParameter("paid"));
		double due=fee-paid;
		String contact=request.getParameter("contact");
		String type=request.getParameter("type");
		Student detail = new Student(name, password, email, course, sex, fee, paid, due, contact, type);
		studentUtil.addDetail(detail);
		response.sendRedirect("StudentController");

}
}