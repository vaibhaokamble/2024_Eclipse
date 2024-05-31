package vaibhao.vk;
import java.sql.*;
import java.util.Scanner;
public class PreparedStatementApplication {

	public static void main(String[] args) throws SQLException {
		com.mysql.cj.jdbc.Driver driver = new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","vaibhaovk","vaibhao");
		if (connection!=null) {
			Scanner v=new Scanner(System.in);
			System.out.println("Enter the name of employee");
			String name=v.nextLine();
			System.out.println("Enter the id of emplooyee");
			int id=v.nextInt();
			System.out.println("Enter the salary of employee");
			int salary=v.nextInt();
			PreparedStatement preparedStatement=connection.prepareStatement("insert into employee values (?,?,?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, salary);
			int value=preparedStatement.executeUpdate();
			if (value>0) {
				System.out.println("Value added");
			}
			else {
				System.out.println("Value not added");
			}
		}else {
			System.out.println("Not connected");
		}
	}
}
