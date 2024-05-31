package vaibhao.vk;

import java.sql.*;
import java.util.*;

public class UserValidationApplication {

	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/oct2023","vaibhaovk","vaibhao");
		if (conn!=null) {
			Scanner v= new Scanner(System.in);
			System.out.println("Enter the username and password");
			String username=v.nextLine();
			String password=v.nextLine();
			PreparedStatement pstmt=conn.prepareStatement("select * from login where username=? and password=?");
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			ResultSet rs=pstmt.executeQuery();
			if (rs.next()) {
				System.out.println("User present in Database....");
			}
			else {
				System.out.println("User Not present in database....");
			}
		}
		else {
			System.out.println("Not a connecting.....");
		}
	}
}
