package com.surbhi.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	public static Connection getCon() throws Exception{
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fee_management","root","root");
		return con;
}
}
