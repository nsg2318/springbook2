package com.tobi.springbook;

import com.tobi.springbook.user.dao.DaoFactory;
import com.tobi.springbook.user.dao.UserDao;
import com.tobi.springbook.user.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringbookApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringbookApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
		UserDao userDaoBean = context.getBean("userDaoBean", UserDao.class);

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
		UserDao userDao = daoFactory.userDaoBean();
		userDaoBean.add(user);
		userDaoBean.add(user1);
		userDaoBean.add(user2);

		userDaoBean.get(1L);
		userDaoBean.get(2L);
		userDaoBean.get(3L);
	}

}
