package com.tobi.springbook;

import com.tobi.springbook.user.dao.UserDao;
import com.tobi.springbook.user.domain.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbookApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringbookApplication.class, args);

		UserDao userDao = new UserDao();
		User user = new User();
		user.setName("남기");
		user.setPassword("abcd");

		userDao.add(user);

		System.out.println(user.getName()+" 등록 성공");

		User user1 = userDao.get(1L);
		System.out.println(user1.getPassword());
	}

}
