package vaibhao.vk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/hospital";
    private static final String USER = "vaibhaovk";
    private static final String PASS = "vaibhao";

    private GetConnection() {
        // Private constructor to prevent instantiation
    }

    public static Connection getConnection() {
        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create and return a new connection
            return DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            // Log or handle the exception appropriately
            e.printStackTrace();
            return null; // Return null in case of failure
        }
    }
}
