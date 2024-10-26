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
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/Registration")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String contact=request.getParameter("contact");
		String qual=request.getParameter("qual");
		String username=request.getParameter("username");
		String password=request.getParameter("password");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_eclipse","root'","vaibhao");
			if (connection!=null) {
				PreparedStatement psmt=connection.prepareStatement("insert into new_registration values ('0',?,?,?,?,?,?)");
				psmt.setString(1, name);
				psmt.setString(2, email);
				psmt.setString(3, contact);
				psmt.setString(4, qual);
				psmt.setString(5, username);
				psmt.setString(6, password);
				int value=psmt.executeUpdate();
				if (value>0) {
					out.println("Registration success..........");
				}
				else {
					out.println("Failed..........");
				}
			}
			else {
				out.println("Not connected");
			}
		} catch (Exception e) {
out.println("Error is " +e);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
