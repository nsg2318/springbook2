package com.tobi.springbook;

import com.tobi.springbook.user.dao.DaoFactory;
import com.tobi.springbook.user.dao.UserDao;
import com.tobi.springbook.user.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbookApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringbookApplication.class, args);

		User user = new User();
		user.setName("유저1");
		user.setPassword("abcd");
		User user1 = new User();
		user1.setName("유저2");
		user1.setPassword("dcba");
		User user2 = new User();
		user2.setName("왜안돼");
		user2.setPassword("이제될걸");

		DaoFactory daoFactory = new DaoFactory();
		UserDao userDao = daoFactory.userDao();
		userDao.add(user);
		userDao.add(user1);
		userDao.add(user2);

		userDao.get(1L);
		userDao.get(2L);
		userDao.get(3L);
	}

}
