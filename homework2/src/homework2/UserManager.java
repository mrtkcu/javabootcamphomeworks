package homework2;

public class UserManager {
	public void add(User user) {
		System.out.println("User is added with the id of :" + user.getId());	
	}
	
	public void delete(User user) {
		System.out.println("User is deleted");
	}
	
	public void update(User user) {
		System.out.println("User is updated");
	}
}
