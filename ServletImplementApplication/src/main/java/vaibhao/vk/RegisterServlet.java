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

import com.mysql.cj.jdbc.Driver;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/Register")
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
		PrintWriter outPrintWriter = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		try {
			com.mysql.cj.jdbc.Driver driver =new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_eclipse","vaibhaovk","vaibhao");
			if (connection!=null) {
				PreparedStatement stmtPreparedStatement=connection.prepareStatement("insert into registration values('0',?,?,?,?,?')");
				stmtPreparedStatement.setString(1, name);
				stmtPreparedStatement.setString(2, email);
				stmtPreparedStatement.setString(3, contact);
				stmtPreparedStatement.setString(4, username);
				stmtPreparedStatement.setString(5, password);
				int value=stmtPreparedStatement.executeUpdate();
				if (value>0) {
					outPrintWriter.println("<h1>Registration succefull...........</h1>");
				}
				else {
					outPrintWriter.println("<h1>Regitration failed...........</h1>");
				}
			}
			outPrintWriter.println("not connected");
		} catch (Exception e) {
			System.out.println("error is"+e);
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
