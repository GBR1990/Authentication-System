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
 * Servlet implementation class CreateServlet
 */
@WebServlet("/create")
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String password;
		String username;
		String age;
		String email;
		String number;
		//username and password are obtained from the user.
		username = request.getParameter("username");
		password = request.getParameter("password");
		age=request.getParameter("age");
		email=request.getParameter("email");
		number=request.getParameter("number");
		LoginService loginservice = new LoginService();
		int k = loginservice.createUser(username, password,age,email,number);
		//If user is created, the user id is returned as k.
		if (k>0) {
			//The user is allowed to login.
			loginservice.LoginServiceToJDBC();
			User user = loginservice.getUserDetails(k);
			request.setAttribute("user", user);
			
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
			return;
		} else {
			response.sendRedirect("login.html");
		}

	}

}
