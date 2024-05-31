package vaibhao.vk;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
public class DemoJDBCApp {
	public static void main(String[] args) throws SQLException {
	com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(d);
	System.out.println("JDBC Coonected successfully.........");
	}
}
