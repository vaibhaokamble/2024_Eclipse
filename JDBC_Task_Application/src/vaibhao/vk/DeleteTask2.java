package vaibhao.vk;

import java.sql.*;
import java.util.Scanner;

public class DeleteTask2 {
	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "vaibhaovk","vaibhao");
		if (connection != null) {
			Scanner v = new Scanner(System.in);
			System.out.println("Enter the id of student");
			String id = v.nextLine();
			Statement statement = connection.createStatement();
			int value = statement.executeUpdate("delete from student where sid=" + id + "");
			if (value > 0) {
				System.out.println("=====Save the record=====");
			} else {
				System.out.println("Not save the record");
			}
		} else {
			System.out.println("Not Connceted.................");
		}
	}
}
