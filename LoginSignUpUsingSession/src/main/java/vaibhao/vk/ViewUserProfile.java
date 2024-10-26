package vaibhao.vk;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/view")
public class ViewUserProfile extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>I can show the login user profile</h1>");
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("uid");
		int loginUserId = Integer.parseInt(obj.toString());
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_eclipse", "vaibhaovk", "vaibhao");
			if (conn != null) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("select *from sessionregister where rid=" + loginUserId);
				if (rs.next()) {
					out.println("<table>");
					out.println("<tr><td>Name</td><td>" + rs.getString(2) + "</td></tr>");
					out.println("<tr><td>Name</td><td>" + rs.getString(3) + "</td></tr>");
					out.println("<tr><td>Name</td><td>" + rs.getString(4) + "</td></tr>");
					out.println("<tr><td>Name</td><td>" + rs.getString(5) + "</td></tr>");
					out.println("<tr><td>Name</td><td>" + rs.getString(6) + "</td></tr>");
					out.println("</table>");
				}

			} else {

			}
		} catch (Exception ex) {
			out.println("Error is " + ex);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
