package com.tobi.springbook;

import com.tobi.springbook.user.dao.UserDaoDetail;
import com.tobi.springbook.user.dao.abstractModule.NaverUserDao;
import com.tobi.springbook.user.dao.abstractModule.UserDaoAbstract;
import com.tobi.springbook.user.domain.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbookApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringbookApplication.class, args);

//		UserDaoDetail userDaoDetail = new UserDaoDetail();
		UserDaoAbstract userDaoAbstract = new NaverUserDao();
		User user = new User();
		user.setName("SUNBA");
		user.setPassword("COUPLE");

		userDaoAbstract.add(user);

		System.out.println(user.getName()+" -> 등록 성공");

		User user1 = userDaoAbstract.get(1L);
		System.out.println(user1.getPassword()+ " -> 비번 추출 성공");
	}

}
