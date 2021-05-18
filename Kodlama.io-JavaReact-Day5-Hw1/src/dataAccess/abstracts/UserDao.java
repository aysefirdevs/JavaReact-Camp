package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	void register(User user);
	void update(User user);
	void delete(User user);
	void login(User user);
	List<User> getAll();
	
}
