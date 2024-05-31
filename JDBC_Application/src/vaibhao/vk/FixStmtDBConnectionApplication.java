package vaibhao.vk;

import java.sql.*;
import java.util.Scanner;

public class FixStmtDBConnectionApplication {
	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","vaibhaovk","vaibhao");
		if (connection!=null) {
			Scanner v = new Scanner(System.in);
			System.out.println("Enter the name of employee ");
			String name=v.nextLine();
			System.out.println("Enter the id of employee");
			int id=v.nextInt();
			System.out.println("Enter the salary of employee");
			int salary=v.nextInt();
			Statement statement=connection.createStatement();
			int value = statement.executeUpdate("insert into employee values ("+id+", '"+name+"',"+ salary+")");
			if (value>0) {
				System.out.println("=====Save the record=====");
			}
			else {
				System.out.println("Not save the record");
			}
		}
		else {
			System.out.println("Not Connceted.................");
		}
		}
}
