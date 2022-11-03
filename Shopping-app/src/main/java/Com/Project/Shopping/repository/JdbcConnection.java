package Com.Project.Shopping.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection 
{

	        public static Connection getConnection() {
			
			String url="jdbc:mysql://localhost:3306/shopping";
			String user="root";
			String password= "Harisre";
			Connection connection =null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection= DriverManager.getConnection(url, user, password);
			}catch(Exception e) {
				e.printStackTrace();
			}	
			return connection;
		}

	}

