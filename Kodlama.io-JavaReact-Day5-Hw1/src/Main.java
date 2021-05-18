import business.abstracts.UserService;
import business.concretes.UserManager;
import core.concretes.LoggerManagerAdapter;
import dataAccess.concretes.HibernateUserDao;
import dataAccess.concretes.PostgresqlUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService= new UserManager(new HibernateUserDao(),new LoggerManagerAdapter());
		UserService userService2=new UserManager(new PostgresqlUserDao(), new LoggerManagerAdapter());
		
		User user1= new User(1,"ayse", "celik","aysefirdevs2@gmail.com","1234");
		User user2=new User(2, "rumeysa","celik","rumeysace@gmail.com","1234567");
		
		
		userService2.update(user2);
		userService.register(user1);
		userService2.isActive(user2);
		
		
	}

}
