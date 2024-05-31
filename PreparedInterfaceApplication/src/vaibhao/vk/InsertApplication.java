package vaibhao.vk;

import java.sql.*;
import java.util.*;

public class InsertApplication {

	public static void main(String[] args) throws Exception {
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oct2023", "vaibhaovk", "vaibhao");
		if (conn != null) {
			Scanner v = new Scanner(System.in);

			System.out.println("Enter the id");
			String id = v.nextLine();
			System.out.println("Enter the name");
			String name = v.nextLine();
			System.out.println("Enter the email");
			String email = v.nextLine();
			System.out.println("Enter the Contact");
			String contact = v.nextLine();
			System.out.println("Connected");
			PreparedStatement stmt = conn.prepareStatement("insert into register value(?,?,?,?)");
			stmt.setString(1, id);
			stmt.setString(2, name);
			stmt.setString(3, email);
			stmt.setString(4, contact);
		
			int value = stmt.executeUpdate();
			if (value > 0) {
				System.out.println("Record Successful");
			} else {
				System.out.println("Some problem is there");
			}
		} else {
			System.out.println("Not Connected");
		}
	}
}