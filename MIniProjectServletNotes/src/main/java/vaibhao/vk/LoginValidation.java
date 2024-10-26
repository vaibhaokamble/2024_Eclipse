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
 * Servlet implementation class LoginValidation
 */
@WebServlet("/validate")
public class LoginValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginValidation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("name");
		String upass=request.getParameter("password");
		
		try {
			com.mysql.cj.jdbc.Driver d= new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(d);
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_eclipse","vaibhaovk","vaibhao");
			if (connection!=null) {
				PreparedStatement stmt=connection.prepareStatement("select * from sregister where username=? and password=?");
				
				stmt.setString(1, uname);
				stmt.setString(2, upass);
				ResultSet rs=stmt.executeQuery();
				if (rs.next()) {
					RequestDispatcher r=request.getRequestDispatcher("welcom.html");
					r.forward(request, response);
				}
				else {
					RequestDispatcher r=request.getRequestDispatcher("login.html");
					r.include(request, response);
					out.println("<h1>Invalid Username and Password</h1>");
				}
			}
			else {
				out.println("Not Connected");
			}
			
		} catch (Exception e) {
			System.out.println("error is"+e);// TODO: handle exception
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
