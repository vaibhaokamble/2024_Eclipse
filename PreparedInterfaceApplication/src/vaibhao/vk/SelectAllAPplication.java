package vaibhao.vk;

import java.util.*;
import java.sql.*;

public class SelectAllAPplication {

	public static void main(String[] args) throws Exception {
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oct2023", "vaibhaovk", "vaibhao");
		if (conn != null) {
			PreparedStatement stmt = conn.prepareStatement("select *from register");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t\t" + rs.getString(3)+ "\t\t" + rs.getString(4));
			}
		} else {
			System.out.println("Not Connected");
		}

	}

}