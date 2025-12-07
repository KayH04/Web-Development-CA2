package defaultPackage;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import javax.servlet.ServletException;


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
		return password;
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
		if(username == null || username.isEmpty()) {
			println("Username is required");
			return "FAILURE";
		}
		
		if(if(password1 == null || password2 == null || !password1.equals(password2)) {
			println("Password is invalid");
			return "FAILURE";)
		
	private Connection conn;
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/gamingPortal", "root", "rootroot1");
		PreparedStatement ps = conn.prepareStatement(
				"INSERT INTO users(username, password, email) VALUES(?, ?, ?)")){
			ps.setString(1, username);
			ps.setString(2, password1);
			ps.executeUpdate();
		}
		
		return SUCCESS;
	}
}