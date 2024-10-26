package vaibhao.vk;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public RegisterServlet() {
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
		String n = request.getParameter("name");
		String e = request.getParameter("email");
		String c = request.getParameter("contact");
		String u = request.getParameter("username");
		String p = request.getParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_eclipse", "vaibhaovk", "vaibhao");
			if (conn != null) {
				PreparedStatement stmt = conn.prepareStatement("insert into registration values('0',?,?,?,?,?)");
				stmt.setString(1, n);
				stmt.setString(2, e);
				stmt.setString(3, c);
				stmt.setString(4, u);
				stmt.setString(5, p);
				int value = stmt.executeUpdate();
				if (value > 0) {
					out.println("<h1>Registration Success...........</h1>");
				} else {
					out.println("<h1>Registration Failed............</h1>");
				}
			} else {
				out.println("DB Not Connected");
			}
		} catch (Exception ex) {
			out.println("Error is " + ex);
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
