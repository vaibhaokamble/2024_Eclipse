package org.techhub.repository;
import java.sql.*;

import org.techhub.model.LoginModel;
import org.techhub.model.Register;

public class RegisterRepositoryImpl implements RegisterRepository {

	private Connection conn;
	private PreparedStatement stmt;
	private ResultSet rs;
	public RegisterRepositoryImpl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/eclipse","vaibhaovk","vaibhao");
		} catch (Exception e) {
			System.out.println("error is"+e);
		}
	}
	
	public boolean isRegisterUser(Register register) {
		// TODO Auto-generated method stub
		try {
			stmt=conn.prepareStatement(" insert into pregister values('0',?,?,?,?,?)");
			stmt.setString(1, register.getName());
			stmt.setString(2, register.getEmail());
			stmt.setString(3, register.getContact());
			stmt.setString(4, register.getUsernname());
			stmt.setString(5, register.getPassword());
			int value =stmt.executeUpdate();
			if (value>0) {
				return true;
			}
			else {
				return false;
			}
		} catch (Exception e) {
			System.out.println("Error is : "+e);
			// TODO: handle exception
			return false;
		}
		
	}

	@Override
	public boolean isValidateUser(LoginModel login) {
		// TODO Auto-generated method stub
		try {
			stmt=conn.prepareStatement("select * from pregister where username=? and password=?");
			stmt.setString(1, login.getName());
			stmt=setString(2,login.getPassword());
			
			rs=stmt.executeQuery();
			if (rs.next()) {
				return true;
			}
			else {
				return false;
			}
		} catch (Exception e) {
			System.out.println("Error is : "+e);
			// TODO: handle exception
			return false;
		}
		
	}

	private PreparedStatement setString(int i, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
