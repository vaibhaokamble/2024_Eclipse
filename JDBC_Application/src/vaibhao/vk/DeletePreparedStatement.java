package vaibhao.vk;
import java.sql.*;
import java.util.*;
public class DeletePreparedStatement {
	public static void main(String[] args)throws SQLException {
	 com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver();
	 DriverManager.registerDriver(d);
	 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","vaibhaovk","vaibhao");
	 if(conn!=null) {
		 Scanner xyz  = new Scanner(System.in);
		 System.out.println("Enter id of employee");
		 int empid=xyz.nextInt();
		 PreparedStatement stmt=conn.prepareStatement("delete from employee where id=?");
		 stmt.setInt(1, empid);
		 int value=stmt.executeUpdate();
		 if(value>0) {
			 System.out.println("Record deleted successfully.....");
		 }
		 else {
			 System.out.println("Some problem is there..................");
		 }
	 }
	 else {
		 System.out.println("Database is not connected");
	 }
	}
}
