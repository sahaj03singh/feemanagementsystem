package com.surbhi.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.surbhi.model.Student;
import com.surbhi.model.ConnectionFactory;


public class StudentDAOImpl implements StudentDAO{

	@Override
	public List<Student> getDetails() throws Exception {
		List<Student> detailList =new ArrayList<>();
	    Connection con=null;
	    PreparedStatement ps=null;
	    ResultSet rs=null;
	    try {
	    	con = ConnectionFactory.getCon();
	    	ps=con.prepareStatement("select * from fee_student order by name");
	       rs=ps.executeQuery();
	       while(rs.next()) {
	    	   int  rollNo=rs.getInt("rollno");
	    	   String name=rs.getString("name");   
	    	   String password=rs.getString(3);
	    	   String email=rs.getString(4);
	    	   String course=rs.getString(5);
	    	   String sex=rs.getString(6);
	    	   int fee=rs.getInt(7);
	    	   int paid=rs.getInt(8);
	    	   int due=rs.getInt(9);
	    	   String contact=rs.getString(10);
	    	   String type=rs.getString(11);
	    	  Student detail=new Student(rollNo, name, password, email, course, sex, fee, paid, due, contact, type);
	    	   detailList.add(detail);
	       }
	    }
	    finally {
	       close(rs,ps,con);
	    }
	    return detailList;
	}
		private void close(ResultSet rs, PreparedStatement ps, Connection con) {
			try {
				if(rs!=null) {
					rs.close();
				}
				if(ps!=null)
				{
					ps.close();
				}
				if(con!=null)
				{
					con.close();
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}

	@Override
	public void addDetail(Student detail) throws Exception {
	
		Connection con=null;
	    PreparedStatement ps=null;
	    try {
	    	con=ConnectionFactory.getCon();
	    	ps=con.prepareStatement("insert fee_student(name,password,email,course,sex,fee,paid,due,contact,type)values(?,?,?,?,?,?,?,?,?,?)");
	        ps.setString(1, detail.getName());
	        ps.setString(2, detail.getPassword());
	        ps.setString(3, detail.getEmail());
	        ps.setString(4, detail.getCourse());
            ps.setString(5, detail.getSex());
	        ps.setDouble(6, detail.getFee());
	        ps.setDouble(7, detail.getPaid());
	        ps.setDouble(8, detail.getDue());
	        ps.setString(9, detail.getContact());
	        ps.setString(10, detail.getType());     
	        ps.executeUpdate();
	        
	    }
	    finally
	    {
	    	close(null,ps,con);
	    }
		}



	@Override
	public void deleteDetail(int rollNo) throws Exception {
		 Connection con=null;
		    PreparedStatement ps=null;
		    try {
		    	con=ConnectionFactory.getCon();
		    	ps=con.prepareStatement("delete from fee_student where rollno = ?");
		        ps.setInt(1,rollNo);
	            ps.executeUpdate();
		        
		    }
		    finally
		    {
		    	close(null,ps,con);
		    }
	}
	@Override
	public List<Student> searchDetail(int rollNo) throws Exception {
		List<Student> detailList=new ArrayList<>();
		 Connection con=null;
		    PreparedStatement ps=null;
		    ResultSet rs=null;
		    try {
		    	con=ConnectionFactory.getCon();
		    	ps=con.prepareStatement("select * from fee_student where rollno = ?");
		        ps.setInt(1,rollNo);
	            rs=ps.executeQuery();
		          while(rs.next()) {
		       	   String name=rs.getString("name");
		       	   String password=rs.getString("password");
		       	   String email=rs.getString("email");
		       	   String course=rs.getString("course");
		       	   String sex=rs.getString("sex");
		       	   int fee =rs.getInt("fee");
		       	   int paid=rs.getInt("paid");
		       	   int due=rs.getInt("due");
		       	   String contact=rs.getString("contact");
		       	   String type=rs.getString("type");
		       	   Student detail= new Student(rollNo, name, password, email, course, sex, fee, paid, due, contact, type);
		       	   detailList.add(detail);
		          }
		    }
		    finally
		    {
		    	close(null,ps,con);
		    }
		    return detailList;
			}
	@Override
	public Student getDetail(int rollNo) throws Exception {
		 Connection con=null;
		    PreparedStatement ps=null;
		    ResultSet rs=null;
		    Student detail=null;
		    try {
		    	con = ConnectionFactory.getCon();
		    	ps=con.prepareStatement("select * from fee_student where rollno = ?");
		    	ps.setInt(1,rollNo);
		       rs=ps.executeQuery();
		       if(rs.next()) {
		    	   String name=rs.getString("name");
		       	   String password=rs.getString("password");
		       	   String email=rs.getString("email");
		       	   String course=rs.getString("course");
		       	  String sex=rs.getString("sex");
		       	   int fee =rs.getInt("fee");
		       	   int paid=rs.getInt("paid");
		       	   int due=rs.getInt("due");
		       	   String contact=rs.getString("contact");
		       	   String type=rs.getString("type");
		       	   detail= new Student(rollNo, name, password, email, course, sex, fee, paid, due, contact, type);
		          }
		       	   
		       else {
		    	   throw new Exception("Could not find rollNo: " + rollNo);
		       }
		    }
		    finally
		    {
		    	close(null,ps,con);
		    }
		    return detail;
 
	}
	@Override
	public void updateDetail(Student detail) throws Exception {
		 Connection con=null;
		    PreparedStatement ps=null;
		    try {
		    	con=ConnectionFactory.getCon();
		    	ps=con.prepareStatement("update fee_student set name=?,email=?,due=?,contact=? where rollno = ?");
		        ps.setString(1, detail.getName());
		        ps.setString(2, detail.getEmail());
		        ps.setDouble(3, detail.getDue());
		        ps.setString(4,detail.getContact());
		        ps.setInt(5,detail.getRollNo());
		        ps.executeUpdate();
		        
		    }
		    finally
		    {
		    	close(null,ps,con);
		    }
	}
		
}

		