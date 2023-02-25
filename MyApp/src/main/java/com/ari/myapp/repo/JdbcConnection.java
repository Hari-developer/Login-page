package com.ari.myapp.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ari.myapp.pojo.Profile;
import com.ari.myapp.pojo.User;



public class JdbcConnection {
	
	public User getUserValueFromUserId(String UserName) {
		User user= null;
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mySql://localhost:3306/myapp","root","Harisre");
		PreparedStatement ps= con.prepareStatement("select * from userdetails where UserName=?");
		ps.setString(1, UserName);
		ResultSet rs= ps.executeQuery();
		while(rs.next()) {
			user= new User();
			user.setUserName(rs.getString(1));
			user.setPassword(rs.getString(2));			
		}	
		
		}catch(Exception e) {
			
			
		}
		return user;
		
	}

	public boolean signup(Profile profile) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");		
		Connection con= DriverManager.getConnection("jdbc:mySql://localhost:3306/myapp","root","Harisre");
		PreparedStatement ps= con.prepareStatement("insert into userdetails values (?,?,?,?,?,?)");
		ps.setString(1, profile.getUserName());
		ps.setString(2, profile.getPassword());
		ps.setString(3, profile.getName());
		ps.setString(4, profile.getPhone());
		ps.setString(5, profile.getEmail());
		ps.setString(6, profile.getCity());
		int result= ps.executeUpdate();
		return result==1;
		
		
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return false;
	}

}
