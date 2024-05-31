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

@WebServlet("/index")
public class index extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String address = request.getParameter("address");
        String branch = request.getParameter("branch");
        String year = request.getParameter("year");
        String percentage = request.getParameter("percentage");

        String jdbcUrl = "jdbc:mysql://localhost:3306/anishree";
        String username = "vaibhaovk";
        String password = "vaibhao";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password)) {
            conn.setAutoCommit(false); // Disable auto-commit to manually commit transaction
            String sql = "INSERT INTO register (firstname, lastname, email, mobile, address, branch, year, percentage) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, firstName);
                ps.setString(2, lastName);
                ps.setString(3, email);
                ps.setString(4, mobile);
                ps.setString(5, address);
                ps.setString(6, branch);
                ps.setString(7, year);
                ps.setString(8, percentage);

                int rowsAffected = ps.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Registration successful");
                    conn.commit(); // Commit the transaction
                    response.sendRedirect("success.jsp");
                } else {
                    System.out.println("Registration failed: No rows affected");
                    request.setAttribute("errorMessage", "Registration failed: No rows affected");
                    request.getRequestDispatcher("error.jsp").forward(request, response);
                }
            }
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
            e.printStackTrace(); // Print stack trace for detailed error information
            request.setAttribute("errorMessage", "Database error: " + e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}
