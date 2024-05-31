package vaibhao.vk;

import java.sql.*;
import java.util.Scanner;

public class CreateTask1 {
	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "vaibhaovk","vaibhao");
		if (connection != null) {
			Scanner v = new Scanner(System.in);
//			System.out.println("Enter the id of student");
//			String id = v.nextLine();
			System.out.println("Enter the name of student");
			String name = v.nextLine();
			System.out.println("Enter the email of student");
			String email=v.nextLine();
			System.out.println("Enter the contact of student");
			String contact=v.nextLine();
			System.out.println("Enter the age of student");
			int age=v.nextInt();
			v.nextLine();
			System.out.println("Enter the state of student");
			String state = v.nextLine();
			Statement statement = connection.createStatement();
			int value = statement.executeUpdate("insert into student values ('0', '" + name + "','" + email + "','"+contact+"','"+age+"','"+state+"')");
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
