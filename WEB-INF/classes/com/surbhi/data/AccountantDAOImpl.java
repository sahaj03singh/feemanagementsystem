package com.surbhi.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.surbhi.model.ConnectionFactory;
import com.surbhi.model.Student;

public class AccountantDAOImpl implements AccountantDAO{

	@Override
	public List<Student> getDetails() throws Exception {
		List<Student> studentList = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet r = null;
		try {
			con = ConnectionFactory.getCon();
			ps=con.prepareStatement("select * from fee_student order by name");
			r = ps.executeQuery();
			while(r.next()) {
				int rollNo = r.getInt("rollno");
				String password=r.getString("password");
				String name=r.getString("name");
				String email=r.getString(4);
				String sex=r.getString(5);
				String course=r.getString(6);
				double fee=r.getDouble(7);
				double paid=r.getDouble(8);
				double due=r.getDouble(9);
				String contact=r.getString(10);
				String type=r.getString(11);
				
				Student list=new Student(rollNo, password, name, email, sex, course, fee, paid, due, contact,type);

				studentList.add(list);
				
				
				
			
						
			}
		}
		finally {
			close(r,ps,con);
		}
			return studentList;
		}

		private void close(ResultSet r, PreparedStatement ps, Connection con) {
		   try {
			   if(r!=null) {
					r.close();
				}
			   
			   
			   if(ps!=null) {
				   ps.close();
			   }
			   if(con!=null) {
				   con.close();
			   }
		   }catch (Exception e) {
				
				e.printStackTrace();
			}
		   
			
	}


	@Override
	public Student viewDetail(int rollNo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet r = null;
		Student list =null;
		try {
			con = ConnectionFactory.getCon();
			ps=con.prepareStatement("select * from fee_student where rollno=?");
			ps.setInt(1,rollNo);
			r = ps.executeQuery();
			if(r.next()) {
				int rollno = r.getInt("rollno");
				String password=r.getString("password");
				String name=r.getString("name");
				String email=r.getString("email");
				String sex=r.getString("sex");
				String course=r.getString("course");
				double fee=r.getDouble("fee");
				double paid =r.getDouble("paid");
				double due=r.getDouble("due");
				String contact=r.getString("contact");
				String type=r.getString("type");
				
		          list=new Student(rollno, password, name, email, sex, course, fee, paid, due, contact,type);
				
				 }
			else {
				throw new Exception("NO RESULT MATCH"+rollNo);
		}
		}
		finally {
			close(null,ps,con);
		}
		return list;
	};

	@Override
	public List<Student> searchDetail1(int rollNo) throws Exception {
		List<Student> list = new ArrayList<>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet r = null;
		try {
			con =ConnectionFactory.getCon();
			ps=con.prepareStatement("select * from fee_student where rollno=?");
			ps.setInt(1,rollNo);
			r = ps.executeQuery();
			while(r.next()) {
				String name= r.getString("name");
				String password=r.getString("password");
				String email=r.getString("email");
				String sex=r.getString("sex");
				String course=r.getString("course");
				double fee=r.getDouble("fee");
				double paid =r.getDouble("paid");
				double due=r.getDouble("due");
				String contact=r.getString("contact");
				String type=r.getString("type");
				

				Student list1=new Student(rollNo, password, name, email, sex, course, fee, paid, due, contact,type);
				
				list.add(list1);
		}
		}
		finally {
			close(null,ps,con);
		}
		return list;
	}	
	}

