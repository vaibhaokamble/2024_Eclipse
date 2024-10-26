package vaibhao.vk.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import vaibhao.vk.model.Student;

public class StudentRepositoryImpl implements StudentRespository {

	private Connection connection;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	public void StudentRespositoryImpl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_eclipse","vaibhaovk","vaibhao");
		} catch (Exception e) {
			System.out.println("Error is "+e);
		}
	}
	
	@Override
	public boolean isAddNewStudent(Student student) {
		try {
			psmt=connection.prepareStatement("insert into student values ('0',?,?,?)");
			psmt.setString(1, student.getName());
			psmt.setString(2, student.getEmail());
			psmt.setString(3, student.getContact());
			
			int value=psmt.executeUpdate();
			if (value>0) {
				return true;
			}
			else {
				return false;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error is "+e);
			return false;
		}
	}

}
