package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class PostgresqlUserDao implements UserDao{
	
	List<User> userList = new ArrayList<User>();

	@Override
	public void register(User user) {
		userList.add(user);
		System.out.println("hesap postgresql ile aktive edildi. "+user.getName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("hesap postgresql ile guncellendi. "+user.getName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("hesap postgresql ile silindi. "+user.getName());
		
	}

	@Override
	public void login(User user) {
		System.out.println("basariyla giris yapildi: "+user.getName());
	}

	@Override
	public List<User> getAll() {
		return userList;
	}

}
