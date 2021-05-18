package business.concretes;

import java.util.List;

import business.abstracts.UserService;
import core.abstracts.LoggerService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	private LoggerService loggerService;

	public UserManager(UserDao userDao, LoggerService loggerService) {
		super();
		this.userDao = userDao;
		this.loggerService=loggerService;
	}

	@Override
	public void register(User user) {
		if(user.getName().length()<=2 || user.getSurname().length()<=2 || user.getPassword().length()<6 ) {
			System.out.println("bilgilerinizi kontrol edip tekrar uye olmayi deneyin..");
		}
		userDao.register(user);
		loggerService.log();
		
	}

	@Override
	public void login(User user) {
		if(user.getEmail()== null || user.getPassword()==null ) {
			System.out.println("bilgilerini tekrar gir, yanlis giris");
			return;
		}
		userDao.login(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

	@Override
	public boolean isActive(User user) {
		System.out.println("kullanici aktif edildi: "+user.getName());
		return false;
	}



}
