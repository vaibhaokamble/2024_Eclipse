package vaibhao.vk;

import java.sql.*;

public class StmtDatabaseConnectionApplication {

	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "vaibhaovk",
				"vaibhao");
		if (connection != null) {
			System.out.println("Connected Successfully............");
			Statement statement = connection.createStatement();
//		System.out.println("Statement Create Successfully..........");
			int value = statement.executeUpdate("insert into employee values(1,'vaibhao',10000)");
			if (value > 0) {
				System.out.println("Record Save in Database Table............");
			} else {
				System.out.println("Some Problem is There...........");
			}
		} else {
			System.out.println("Not Connected............");
		}
	}

}
