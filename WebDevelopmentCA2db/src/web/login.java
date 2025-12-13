package web;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.Action;



public class login implements Action{
	
	String username;
	String password1;
	
	
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
				
			if(rs.next()) {
				return "SUCCESS";
			}else {
				return "FAILURE";
		}
	  }
	}
}
	

	
	
	
	
	
	
	
	
	
	