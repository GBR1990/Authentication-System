package org.gireeshma.reddy;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.gireeshma.reddy.dto.User;
import org.gireeshma.reddy.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String password;
	 Integer userId;
	 System.out.println("In servlet");
	 //get the user id and password from the user.
	 userId=Integer.parseInt(request.getParameter("userId"));
	 password=request.getParameter("password");
	 LoginService loginService=new LoginService();
	 
	 //store matching results from database in hashmap.
	 loginService.LoginServiceToJDBC();
	 
	 boolean result=loginService.authenticate(userId, password);
	 
	 //If authentication is successful.
	 if(result)
	 { User user=loginService.getUserDetails(userId);
	 request.setAttribute("user",user);
	
	 //forward the request to success.jsp
	 RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
	 dispatcher.forward(request, response);
	 return;
	 }
	 else
	 {
		 System.out.println("In else");
		 response.sendRedirect("login.html");
	 }
	 
	 
	}

}
