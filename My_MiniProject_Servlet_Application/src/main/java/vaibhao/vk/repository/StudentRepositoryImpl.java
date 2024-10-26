package vaibhao.vk.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vaibhao.vk.modul.Student;

public class StudentRepositoryImpl implements StudentRepository {

	private Connection connection;
	private PreparedStatement stmt;
	private ResultSet rs;
	private List<Student> studList;

	public StudentRepositoryImpl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myproject", "vaibhaovk", "vaibhao");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver not found: " + e);
		} catch (SQLException e) {
			System.out.println("Error establishing connection: " + e);
		}
	}

	@Override
	public boolean isAddNewStudent(Student student) {
		if (connection == null) {
			System.out.println("Database connection is not established.");
			return false;
		}

		String query = "INSERT INTO student (name, email, contact) VALUES (?, ?, ?)";
		try (PreparedStatement stmt = connection.prepareStatement(query)) {
			stmt.setString(1, student.getName());
			stmt.setString(2, student.getEmail());
			stmt.setString(3, student.getContact());

			int value = stmt.executeUpdate();
			return value > 0;
		} catch (SQLException e) {
			System.out.println("Error adding new student: " + e);
			return false;
		}
	}

	// Ensure to close the connection when done
	public void close() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Error closing connection: " + e);
			}
		}
	}

	@Override
	public List<Student> getAllStudentRecords() {
		try {
			studList = new ArrayList<Student>();
			stmt = connection.prepareStatement("select * from student");
			rs = stmt.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setEmail(rs.getString(3));
				student.setContact(rs.getString(4));
				studList.add(student);
			}
		} catch (Exception e) {

			System.out.println("Error is " + e);
		}
		return studList;
	}

	@Override
	public boolean isDeleteRecord(int id) {
		try {
			stmt=connection.prepareStatement("delete from student where sid=?");
			stmt.setInt(1, id);
			int value=stmt.executeUpdate();
			if (value>0) {
				return true;
			}
			else {
				return false;
			}
		} catch (Exception e) {
			System.out.println("Error is " +e);
		}
		return false;
	}
}
