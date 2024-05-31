package vaibhao.vk;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateDoctor")
public class CreateDoctor extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public CreateDoctor() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Connection c = null;
        PreparedStatement ps = null;

        try {
            c = GetConnection.getConnection();
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            int age = Integer.parseInt(request.getParameter("age"));
            String joindate = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
            long salary = Long.parseLong(request.getParameter("sal"));
            String specialist = request.getParameter("spec");
            String patients = "-1"; // initial is -1 always for every doctor

            String sql = "INSERT INTO doctor (name, email, phone, age, joindate, salary, specialist, patients) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            ps = c.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setInt(4, age);
            ps.setString(5, joindate);
            ps.setLong(6, salary);
            ps.setString(7, specialist);
            ps.setString(8, patients);

            int rowsAffected = ps.executeUpdate();

            if (rowsAffected == 1) {
                response.sendRedirect("success.html"); // Redirect to a success page
            } else {
                response.sendRedirect("error.html"); // Redirect to an error page
            }
        } catch (SQLException e) {
            response.sendRedirect("error.html"); // Redirect to an error page
            e.printStackTrace(); // Log the exception
        } finally {
            // Close PreparedStatement and Connection in a finally block
            try {
                if (ps != null) {
                    ps.close();
                }
                if (c != null) {
                    c.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
