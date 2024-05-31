package vaibhao.vk;

import java.sql.*;

public class TestDriverApplication {

	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
//		System.out.println("Connected successfully........................");  //Step first
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "vaibhaovk",
				"vaibhao");
		if (connection != null) {
			System.out.println("Connected successfully..........................");
		} else {
			System.out.println("Not connected...........................");
		}
	}
}
