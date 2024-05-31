package vaibhao.vk;
import java.io.CharConversionException;
import java.sql.*;
import java.util.Scanner;
public class SelectWhereApplication {

	public static void main(String[] args)  throws SQLException{
		com.mysql.cj.jdbc.Driver driver= new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);;
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","vaibhaovk","vaibhao");
		if (connection!=null) {
			Scanner v= new Scanner(System.in);
			System.out.println("Enter the id of employee: ");
			int id=v.nextInt();
			Statement stmt=connection.createStatement();
			ResultSet rSet=stmt.executeQuery("select * from employee where id="+id);
			if(rSet.next()) {
				System.out.println("Employee found");
				System.out.println(rSet.getInt("id")+rSet.getString("name")+rSet.getInt("salary"));
			}
			else {
				System.out.println("Employee not found");
			}
		}
		else {
			System.out.println("Not connected..........");
		}
	}

}
