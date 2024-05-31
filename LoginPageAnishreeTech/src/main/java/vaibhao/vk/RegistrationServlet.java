package vaibhao.vk;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Database connection details
        String jdbcUrl = "jdbc:mysql://localhost:3306/anishree";
        String username = "vaibhaovk";
        String password1 = "vaibhao";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password1)) {
            String sql = "INSERT INTO ani_user (first_name, last_name, email, password) VALUES (?, ?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, firstName);
                ps.setString(2, lastName);
                ps.setString(3, email);
                ps.setString(4, password1);

                int rowsAffected = ps.executeUpdate();
                if (rowsAffected > 0) {
                    // Registration successful, redirect to success page
                    response.sendRedirect("success.html");
                } else {
                    // Registration failed, redirect to error page
                    response.sendRedirect("error.html");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Database error, redirect to error page
            response.sendRedirect("error.html");
        }
    }
}
