package vaibhao.vk;
import java.sql.*;
import java.util.Scanner; 
public class UpdateTask3 {

	public static void main(String[] args) throws SQLException {
	com.mysql.cj.jdbc.Driver driver= new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(driver);
	Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","vaibhaovk","vaibhao");
	if (connection!=null) {
		Statement statement = connection.createStatement();
		Scanner v=new Scanner(System.in);
		System.out.println("Enter name of student");
		String name= v.nextLine();
		System.out.println("Enter email of student");
		String email=v.nextLine();
		System.out.println("Enter contact of student");
		String contact= v.nextLine();
		System.out.println("Enter age of student");
		String age= v.nextLine();
		System.out.println("Enter state of student");
		String state= v.nextLine();
		System.out.println("Enter id of student");
		int id= v.nextInt();
		int value=statement.executeUpdate("update student set name='"+name+"',email='"+email +"',contact='"+contact+"',age='"+age+"',state='"+state+"' where sid="+id);
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
