package web;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import javax.servlet.ServletException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class registration{
	
	private String username;
	private String password1;
	private String password2;
	
	public String getUsername() {
		return username;
	}
	public void setUsername() {
		this.username = username;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1() {
		this.password1 = password1;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2() {
		this.password2 = password2;
	}

public String execute() throws Exception{
			
	Class.forName("com.mysql.cj.jdbc.Driver");
	try(Connection conn = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/ca2db",
			"root", "rootroot1")){
		String sql = "SELECT * FROM users WHERE username =? AND password =?";
			
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1,  username);
		ps.setString(2,  password1);
			
		ResultSet rs = ps.executeQuery();
		
		if(username == null || username.isEmpty()) {
			System.out.println("Username is required");
			return "FAILURE";
		}else {
			if(password1 == null || password2 == null || !password1.equals(password2)) {
			System.out.println("Password is invalid");
			return "FAILURE";	
		}else {
				return "SUCCESS";	
			}
			
		
	
	}
}
}
}