package com.rest.wesbservices.rest_web_services.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();

	static {
		users.add(new User(1, "Israt", LocalDate.now().minusYears(30)));
		users.add(new User(2, "Alex", LocalDate.now().minusYears(30)));
		users.add(new User(3, "Sophia", LocalDate.now().minusYears(30)));
		users.add(new User(4, "Tilda", LocalDate.now().minusYears(30)));
		users.add(new User(5, "Erik", LocalDate.now().minusYears(30)));
	}

	public List<User> findAll() {
		return users;
	}

}
