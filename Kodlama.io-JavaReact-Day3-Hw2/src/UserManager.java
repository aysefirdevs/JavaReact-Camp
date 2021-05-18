
public class UserManager {

	public void add(User user) {
		System.out.println("Kullanıcı eklendi: " + user.getName());
	}
	
	public void update(User user) {
		System.out.println("Kullanıcı güncellendi:" + user.getName());
	}

	public void addMultiple(User[] users) {

		for (User user : users) {
			add(user);
		}
	}

}
