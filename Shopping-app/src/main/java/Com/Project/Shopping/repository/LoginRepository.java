package Com.Project.Shopping.repository;
import java.sql.Connection;
import java.sql.PreparedStatement;

import Com.Project.Shopping.Pojo.UserPass;



public class LoginRepository {
	
   public boolean login(UserPass user) {
			boolean isRecordsAdded= false;
			try {
			Connection con= JdbcConnection.getConnection();
			if(con!=null) {
			String query= "insert into login values (?,?)";
			PreparedStatement ps= con.prepareStatement(query);
			ps.setString(1,user.getUserName());
			ps.setString(2,user.getPassWord());
			
			int result =ps.executeUpdate();
			if(result ==1){
				isRecordsAdded=true;	
			}			
			}
			}catch(Exception e) {
				e.printStackTrace();
			}		
			
			return isRecordsAdded;
		}
		
	}
