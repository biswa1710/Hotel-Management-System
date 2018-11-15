import java.sql.*;

public class DBConnect {
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public DBConnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop","root","");
			st = con.createStatement();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	public void setNuserData(User nuser) throws Exception {
		try {
			String query = "INSERT INTO users (name, dob, address, email, username, password) "
			+ "VALUES ('" + nuser.getName() + "','" + nuser.getDob() + "','" + nuser.getAddress()+"','"+nuser.getEmail()+ "', '"+nuser.getUsername()+"', '"+nuser.getPass()+"' )";
			st.executeUpdate(query);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public boolean login (User nuser) {
		String password = null;
		String npassword = "a";
		try {
			String query = "SELECT*FROM users WHERE username = '"+nuser.getUsername()+"';";
			rs = st.executeQuery(query);
			rs.next();
			npassword = nuser.getPass();
			password = rs.getString("password");
			
		}catch(Exception e) {
			System.out.println(e);
			return false;
		}
		if(password.compareTo(npassword)==0) {
			return true;
		}
		else {
			return false;
		}

	}
}
