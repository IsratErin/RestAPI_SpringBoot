package com.rest.wesbservices.rest_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();

	private static int userId = 0;

	static {
		users.add(new User(++userId, "Israt", LocalDate.now().minusYears(30)));
		users.add(new User(++userId, "Alex", LocalDate.now().minusYears(20)));
		users.add(new User(++userId, "Sophia", LocalDate.now().minusYears(10)));
		users.add(new User(++userId, "Tilda", LocalDate.now().minusYears(15)));
		users.add(new User(++userId, "Erik", LocalDate.now().minusYears(35)));
	}

	public List<User> findAll() {
		return users;
	}

	public User retrieveUserInfo(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().get();
	}

	public User createNewUser(User user) {
		user.setId(++userId);
		users.add(user);
		return user;
	}

}
