package com.ari.myapp.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ari.myapp.pojo.Profile;




/**
 * Servlet implementation class Profileservlet
 */
@WebServlet("/profile")
public class Profileservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Profileservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Profile user= new Profile();
		HttpSession session = request.getSession();
		
		session.setAttribute("Username", user.getName());
		session.setAttribute("PassWord", user.getPassword());
		session.setAttribute("Name", user.getName());
		session.setAttribute("Email", user.getEmail());
		session.setAttribute("Phono", user.getPhone());
		session.setAttribute("City", user.getCity());
		
		String UserName=(String) session.getAttribute("userName");
		String Password=(String) session.getAttribute("PassWord");
		String Name=(String) session.getAttribute("Name");
		String Email=(String) session.getAttribute("Email");
		String phono=(String) session.getAttribute("Phono");
		String city=(String) session.getAttribute("City");
	
		request.setAttribute("user", user);		
		request.getRequestDispatcher("profile.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
