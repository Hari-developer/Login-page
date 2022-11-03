package Com.Project.Shopping.Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.Project.Shopping.Pojo.UserPass;
import Com.Project.Shopping.Service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String UserName=request.getParameter("UserName");
		String PassWord=request.getParameter("PassWord");
		
		
		UserPass user= new UserPass();
		user.setUserName(UserName);
		user.setPassWord(PassWord);
		
		
		LoginService LoginService= new LoginService();
		Boolean result = LoginService.Login(user);
		if(result)
			System.out.println("RECORDS INSERTED");
		
		
		
	}

}
