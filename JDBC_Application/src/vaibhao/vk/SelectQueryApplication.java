package vaibhao.vk;
import java.sql.*;
public class SelectQueryApplication {

	public static void main(String[] args) throws SQLException {
	com.mysql.cj.jdbc.Driver driver = new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(driver);
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","vaibhaovk","vaibhao");
	if (connection!=null) {
		Statement statement=connection.createStatement();
		ResultSet rSet=statement.executeQuery("select * from employee");
		while (rSet.next()) {
			System.out.println(rSet.getInt("id")+"\t"+rSet.getString("name")+"\t"+rSet.getInt("salary"));
		}
	}
	else {
		System.out.println("Not connected");
	}
	}
}
