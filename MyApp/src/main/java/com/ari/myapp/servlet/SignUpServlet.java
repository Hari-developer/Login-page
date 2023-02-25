package com.ari.myapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ari.myapp.pojo.Profile;
import com.ari.myapp.service.LoginService;



/**
 * Servlet implementation class SignUpServlet
 */
@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("signup.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Profile profile= new Profile();
		profile.setUserName(request.getParameter("UserName"));
		profile.setPassword(request.getParameter("Password"));
		profile.setName(request.getParameter("Name"));
		profile.setEmail(request.getParameter("PhoneNo"));
		profile.setPhone(request.getParameter("Email"));
		profile.setCity(request.getParameter("City"));
		
		LoginService service= new LoginService();
		Boolean isInserted= service.signup(profile);
		if(isInserted) {
			response.sendRedirect("login");
		}else {
			response.sendRedirect("error");
		}
		
		
		
		
	}

}
