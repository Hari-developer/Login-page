package com.ari.myapp.servlet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ErrorServlet
 */
@WebServlet("/error")
public class ErrorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ErrorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies= request.getCookies();
		int errorCode=-1;
		for(Cookie cookie: cookies) {
			if(cookie.getName().equalsIgnoreCase("errorcode")) {
				errorCode=Integer.valueOf(cookie.getValue());
			}
		}
		String errorMessage="";
		if(errorCode == 1){
			errorMessage="No User Found";
		}else if(errorCode == 2){
			errorMessage="Invalid Password";
		}
		request.setAttribute("errorMessage", errorMessage);
		request.getRequestDispatcher("error.jsp").forward(request, response);
	}

}
