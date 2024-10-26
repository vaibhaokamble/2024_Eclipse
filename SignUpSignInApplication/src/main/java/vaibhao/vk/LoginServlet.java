package vaibhao.vk;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String un = request.getParameter("name");
		String up = request.getParameter("pass");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_eclipse", "vaibhaovk", "vaibhao");
			if (conn != null) {
				PreparedStatement stmt = conn.prepareStatement("select *from registration where username=? and password=?");
				stmt.setString(1, un);
				stmt.setString(2, up);
				ResultSet rs = stmt.executeQuery();
				if (rs.next()) {
					RequestDispatcher r = request.getRequestDispatcher("welcome.html");
					r.forward(request, response);

				} else {
					RequestDispatcher r = request.getRequestDispatcher("invalid.html");
					r.include(request, response);


				}
			} else {
				out.println("<h1>DB Not Conencted</h1>");
			}
		} catch (Exception ex) {
			out.println("error is " + ex);
		}

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
