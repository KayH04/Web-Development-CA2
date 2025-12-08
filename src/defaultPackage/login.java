import java.util.HashMap;

public class login{
	
	String username;
	String password1;
	
	 private static HashMap<String,String> userMap = new HashMap<String,String>();
	    static {
	        userMap.put("sarah", "pass1");
	        userMap.put("john", "pass2");
	    }
	
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
	
	public login() {
		
		if (userMap.containsKey(username) && userMap.get(username).equals(password1)) {
			return "SUCCESS";
		}else {
			return "FAILURE";
		}
	
		
		private Connection conn;
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try (conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/gamingPortal", "root", "rootroot1");
	}
		PreparedStatement ps = conn.prepareStatement(
	
	
}
}