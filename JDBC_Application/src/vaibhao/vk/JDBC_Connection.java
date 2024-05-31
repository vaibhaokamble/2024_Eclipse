package vaibhao.vk;

import java.sql.*;

public class JDBC_Connection {

	public static void main(String[] args) throws Exception {
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/eclipse","vaibhaovk","vaibhao");
		if(conn!=null) {
			System.out.println("Connected Succesfully.......");
		}
		else
		{
			System.out.println("Connection Failed");
		}
	}
}
