package homework2;

public class Instructor extends User{
	
	private String userName;
	private String password;
	
	public Instructor(int id, String userName, String password) {
		super(id);
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
