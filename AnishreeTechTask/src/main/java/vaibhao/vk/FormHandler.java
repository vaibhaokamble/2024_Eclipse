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
 * Servlet implementation class FormHandler
 */
@WebServlet("/register")
public class FormHandler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormHandler() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String f = request.getParameter("firstname");
		String l = request.getParameter("lastname");
		String e = request.getParameter("email");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/anishree", "vaibhaovk", "vaibhao");
			if (conn != null) {
				PreparedStatement stmt = conn.prepareStatement("insert into demo values(?,?,?)");
				stmt.setString(1, f);
				stmt.setString(2, l);
				stmt.setString(3, e);
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
