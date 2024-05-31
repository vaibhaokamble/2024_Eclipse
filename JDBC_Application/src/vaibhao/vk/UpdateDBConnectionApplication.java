package vaibhao.vk;
import java.sql.*;
import java.util.Scanner; 
public class UpdateDBConnectionApplication {

	public static void main(String[] args) throws SQLException {
	com.mysql.cj.jdbc.Driver driver= new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(driver);
	Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","vaibhaovk","vaibhao");
	if (connection!=null) {
		Statement statement = connection.createStatement();
		Scanner v=new Scanner(System.in);
		System.out.println("Enter name of name");
		String name= v.nextLine();
		System.out.println("Enter id of employee");
		int id=v.nextInt();
		System.out.println("Enter salary of employee");
		int salary= v.nextInt();
		int value=statement.executeUpdate("update employee set name='"+name+"',salary="+salary +" where id="+id);
		if (value>0) {
			System.out.println("Your record save successfully");
		}
		else {
			System.out.println("Some problem is there");
		}
	}
	else {
		System.out.println("Not Connected");
	}
	}

}
