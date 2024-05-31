package vaibhao.vk;

import java.sql.*;
import java.util.*;

public class SelectApplication {

	public static void main(String[] args) throws Exception {
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oct2023", "vaibhaovk", "vaibhao");
		if (conn != null) {
			Scanner v = new Scanner(System.in);
			System.out.println("Enter the name ");
			String name = v.nextLine();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select *from register where name     ='" + name + "'");
			if (rs.next()) {
				System.out.println(rs.getString(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getString(3)+ "\t\t" + rs.getString(4));
			} else {
				System.out.println("Record not found");
			}
		} else {
			System.out.println("Not connected");
		}

	}

}