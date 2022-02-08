package com.tobi.springbook;

import com.tobi.springbook.user.dao.G_applicationContext.CountingRepositoryMakerV5;
import com.tobi.springbook.user.dao.H_setterInjection.DaoFactory;
import com.tobi.springbook.user.dao.H_setterInjection.UserDaoV6;
import com.tobi.springbook.user.domain.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringbookApplication {

  public static void main(String[] args) {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DaoFactory.class);
    UserDaoV6 userDao = applicationContext.getBean("userDaoV6", UserDaoV6.class);
    User user = new User();
    user.setName("SUNBA");
    user.setPassword("COUPLE");

    userDao.add(user);

    System.out.println(user.getName() + " -> 등록 성공");

    User user1 = userDao.get(1L);
    System.out.println(user1.getPassword() + " -> 비번 추출 성공");
  }

}
