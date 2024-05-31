package org.tech.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.techhub.model.LoginModel;
import org.techhub.service.LoginService;
import org.techhub.service.LoginServiceImpl;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("name");
		String password = request.getParameter("pass");

		LoginModel model = new LoginModel();
		model.setName(username);
		model.setPassword(password);

		LoginService loginService = new LoginServiceImpl();

		boolean b = loginService.isValidateUser(model);
		if (b) {
			RequestDispatcher r = getRequestDispatcher("Welcome.html");
			r.forward(request, response);
		} else {
			RequestDispatcher r = getRequestDispatcher("login.html");
			r.include(request, response);
			out.println("<center> Invalid Username And Password </center>");
		}
	}

	private RequestDispatcher getRequestDispatcher(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
