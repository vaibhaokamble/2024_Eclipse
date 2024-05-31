package vaibhao.vk;

import java.sql.*; 
import java.util.*; 
public class InsertApplication { 
 public static void main(String[] args) { 
  Connection conn = null; 
  Statement stmt = null; 
  try { 
 com.mysql.cj.jdbc.Driver d = new com.mysql.cj.jdbc.Driver(); 
   DriverManager.registerDriver(d); 
   conn = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/oct2023", "vaibhaovk", "vaibhao"); 
   if (conn != null) { 
    Scanner xyz = new Scanner(System.in); 
   System.out.println("Enter the name email and contact"); 
    String name = xyz.nextLine(); 
    String email = xyz.nextLine(); 
    String contact = xyz.nextLine(); 
    stmt = conn.createStatement(); 
int val = stmt.executeUpdate("insert into register values('0','name','email','contact')"); 
    if (val > 0) { 
   System.out.println("Record Save Success......................."); 
    } else { 
   System.out.println("Some problem is there........................"); 
    } 
   } else { 
    System.out.println("Not Connected"); 
   } 
  } catch (Exception ex) { 
   System.out.println("Error is " + ex); 
  } 
 
 } 
} 
