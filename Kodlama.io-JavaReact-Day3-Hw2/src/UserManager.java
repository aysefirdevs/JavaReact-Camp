
public class UserManager {

	public void add(User user) {
		System.out.println("Kullanýcý eklendi: " + user.getName());
	}
	
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi:" + user.getName());
	}

	public void addMultiple(User[] users) {

		for (User user : users) {
			add(user);
		}
	}

}
