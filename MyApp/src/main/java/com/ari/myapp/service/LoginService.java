package com.ari.myapp.service;

import com.ari.myapp.pojo.Profile;
import com.ari.myapp.pojo.User;
import com.ari.myapp.repo.JdbcConnection;

public class LoginService {

	public int isValidUser(String UserName, String password) {
		JdbcConnection con= new JdbcConnection();
		User user=con.getUserValueFromUserId(UserName);
		if(user != null) {
			
			if( user.getPassword().equals(password))
				//Success
				return 0;
			else
				//Invalid Password
				return 2;
		}else {
			// No User profile found
			return 1;
		}
		
	}
	
	public boolean signup(Profile profile) {
		JdbcConnection con= new JdbcConnection();
		return con.signup(profile);
	}
}
