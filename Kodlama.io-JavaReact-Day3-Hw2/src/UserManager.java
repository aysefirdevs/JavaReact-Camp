
public class UserManager {

	public void add(User user) {
		System.out.println("Kullan�c� eklendi: " + user.getName());
	}
	
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi:" + user.getName());
	}

	public void addMultiple(User[] users) {

		for (User user : users) {
			add(user);
		}
	}

}
