package vaibhao.vk.repository;

import vaibhao.vk.model.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class StudentRepositoryImpl implements StudentRepository {

	
	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
	
	public StudentRepositoryImpl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql:localhost:3306/eclipse","vaibhaovk","vaibhao");
		} catch (Exception e) {
			System.out.println("Error is :"+e);
		}
	}
	@Override
	public boolean isAddNewStudent(Student student) {

		try {
			stmt=conn.prepareStatement("insert into student values('0',?,?,?)");
			stmt.setString(1, student.getName());
			stmt.setString(2,student.getEmail());
			stmt.setString(3, student.getContact());
			
			int value=stmt.executeUpdate();
			if (value>0) {
				return true;
			}
			else {
				return false;
			}
		} catch (Exception e) {
			System.out.println("Error is :"+e);
			return false;
		}
		
	}

}
