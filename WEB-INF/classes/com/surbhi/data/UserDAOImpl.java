package com.surbhi.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.surbhi.model.ConnectionFactory;
import com.surbhi.model.User;

public class UserDAOImpl implements UserDAO {

	@Override
	public void addUser(User user) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			
			con = ConnectionFactory.getCon();
			ps = con.prepareStatement("insert user values(?,?,?,?)");
			ps.setInt(1, user.getUserId());
			ps.setString(2, user.getName());
			ps.setString(3, user.getPassword());
			ps.setString(4, user.getType());
			
					
			ps.executeUpdate();
			
		}
		finally {
			close(null, ps, con);
		}
		
	}

		

	@Override
	public User getUser(String userId) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		User user = null;
		
		try {
			con = ConnectionFactory.getCon();
			ps = con.prepareStatement("select * from user where userid =?");
			ps.setString(1, userId);
			rs = ps.executeQuery();
			if(rs.next()) {
				user = new User();
				user.setUserId(rs.getInt(1));
				user.setName(rs.getString(2));		
				user.setPassword(rs.getString(3));		
				user.setType(rs.getString(4));
				
			}
			else {
				throw new Exception("Invalid user id");
			}
		}
		finally {
			close(rs, ps, con);
		}
		
		return user;
	}
	
	private void close(ResultSet rs, PreparedStatement ps, Connection con) {
		try {
			if(rs != null) {
				rs.close();
			}
			if( ps != null) {
				ps.close();
			}
			if(con != null) {
				con.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	}

