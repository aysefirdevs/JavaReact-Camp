package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {
	
	private UserCheckService userCheckService;
	
	
	public UserManager(Abstract.UserCheckService userCheckService) {
		super();
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) {
		if(userCheckService.CheckIfRealPerson(user)) {
			System.out.println("kullanýcý eklendi: "+user.getFirstName());
		}
		else {
			System.out.println("hatali kullanici");
		}
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+ " kullanicisi guncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName()+ " kullanicisi silindi.");
		
	}
	
}
