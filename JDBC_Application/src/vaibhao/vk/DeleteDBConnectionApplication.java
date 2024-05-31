package vaibhao.vk;

import java.sql.*;
import java.util.Scanner;

public class DeleteDBConnectionApplication {
	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "vaibhaovk",
				"vaibhao");
		if (connection != null) {
			Statement statement = connection.createStatement();
			Scanner v = new Scanner(System.in);
			System.out.println("Enter the id of employee");
			int id = v.nextInt();
			int value = statement.executeUpdate("delete from employee where id=" + id + "");
			if (value > 0) {
				System.out.println("Record save successfully");
			}
			System.out.println("Some problem is there");
		} else {
			System.out.println("Not Connected");
		}
	}
}
