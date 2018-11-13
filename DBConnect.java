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
	
	public void setNuserData(User nuser) {
		try {
			String query = "INSERT INTO users (name, dob, address, email, username, password) "
			+ "VALUES ('" + nuser.getName() + "','" + nuser.getDob() + "','" + nuser.getAddress()+"','"+nuser.getEmail()+ "', '"+nuser.getUsername()+"', '"+nuser.getPass()+"' )";
			st.executeUpdate(query);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
