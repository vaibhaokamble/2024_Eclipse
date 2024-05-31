package vaibhao.vk;

import java.util.*;
import java.sql.*;

public class DeleteApplication {

	public static void main(String[] args) throws Exception {
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oct2023", "vaibhaovk", "vaibhao");
		if (conn != null) {
			Scanner v = new Scanner(System.in);
			System.out.println("Enter the delete name you want");
			String name = v.nextLine();
			PreparedStatement stmt = conn.prepareStatement("delete from register where name = ?");
			stmt.setString(1, name);
			int value = stmt.executeUpdate();
			if (value > 0) {
				System.out.println("Record delete successfully");
			} else {
				System.out.println("Some Problem Was there");
			}
		} else {
			System.out.println("Database is Not Connected");
		}
	}

}