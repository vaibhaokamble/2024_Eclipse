package vaibhao.vk;

import java.sql.*;

public class Insert_JDBC {
	public static void main(String[] args) throws Exception {
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oct2023", "vaibhaovk", "vaibhao");
		if (conn != null) {
			System.out.println("Database is connected");
			Statement stmt = conn.createStatement();

			int val = stmt.executeUpdate("insert into register values('0','vaibhao','vaibhao@gmail.com','123455')");
			if (val > 0) {
				System.out.println("Record Save................");
			} else {
				System.out.println("Some problem is there....................");
			}

		} else {
			System.out.println("Some problem is there.................");
		}

	}
}