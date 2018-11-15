
public class User {

	private String Name;
	private String dob;
	private String address;
	private String email;
	private String username;
	private String pass;
	private String Location;
	private String Check_in;
	private String Check_out;
	private String No_of_rooms;
	private String No_of_people;
	
	public String getName() {
		return Name;
	}
	public void setname(String name) {
		Name= name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getCheck_in() {
		return Check_in;
	}
	public void setCheck_in(String check_in) {
		Check_in = check_in;
	}
	public String getCheck_out() {
		return Check_out;
	}
	public void setCheck_out(String check_out) {
		Check_out = check_out;
	}
	public String getNo_of_rooms() {
		return No_of_rooms;
	}
	public void setNo_of_rooms(String no_of_rooms) {
		No_of_rooms = no_of_rooms;
	}
	public String getNo_of_people() {
		return No_of_people;
	}
	public void setNo_of_people(String no_of_people) {
		No_of_people = no_of_people;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
