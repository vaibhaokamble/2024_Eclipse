package vaibhao.vk;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/process_booking")
public class BookingServlet extends HttpServlet {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/BookingDB";
    private static final String JDBC_USER = "vaibhaovk";
    private static final String JDBC_PASSWORD = "vaibhao";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieve form data
        String destination = request.getParameter("destination");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        String arrivalDate = request.getParameter("arrival_date");
        String leavingDate = request.getParameter("leaving_date");
        String details = request.getParameter("details");

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            // Connect to MySQL database
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            // SQL query to insert booking data
            String sql = "INSERT INTO Bookings (Destination, Quantity, ArrivalDate, LeavingDate, Details) VALUES (?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(sql);

            // Set parameters for the PreparedStatement
            pstmt.setString(1, destination);
            pstmt.setInt(2, quantity);
            pstmt.setString(3, arrivalDate);
            pstmt.setString(4, leavingDate);
            pstmt.setString(5, details);

            // Execute the query
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                out.println("<html><body>");
                out.println("<h2>Booking Successful!</h2>");
                out.println("</body></html>");
            } else {
                out.println("<html><body>");
                out.println("<h2>Booking Failed!</h2>");
                out.println("</body></html>");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
