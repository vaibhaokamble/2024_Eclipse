package vaibhao.vk;

import java.sql.*;
import java.util.*;

public class DeleteApplication {

	public static void main(String[] args) throws Exception {
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oct2023", "vaibhaovk", "vaibhao");
		if (conn != null) {
			Scanner v = new Scanner(System.in);
			System.out.println("Enter the name of user");
			String name = v.nextLine();
			Statement stmt = conn.createStatement();
			int value = stmt.executeUpdate("delete from register where name='" + name + "'");
			if (value > 0) {
				System.out.println("The value is Successfully Update");
			} else {
				System.out.println("Something Problem is there");
			}
		} else {
			System.out.println("Not Database Connected");
		}
	}

}