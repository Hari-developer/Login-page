package Com.Project.Shopping.Service;

import Com.Project.Shopping.Pojo.UserPass;
import Com.Project.Shopping.repository.LoginRepository;

public class LoginService 
{
	public boolean Login(UserPass user) {
		LoginRepository Login= new LoginRepository();
		return Login.login(user);
}
	}
