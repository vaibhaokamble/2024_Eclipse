package vaibhao.vk;

import java.util.*;
import java.sql.*;

public class SelectApplication {

	public static void main(String[] args) throws Exception {
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oct2023", "vaibhaovk", "vaibhao");
		if (conn != null) {
			Scanner v = new Scanner(System.in);
			System.out.println("Enter the email");
			String email = v.nextLine();
			PreparedStatement stmt = conn.prepareStatement("select *from register where email=?");
			stmt.setString(1, email);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3)+ "\t" + rs.getString(4));
			} else {
				System.out.println("Record not found");
			}
		} else {
			System.out.println("Not Connected");
		}
	}

}
