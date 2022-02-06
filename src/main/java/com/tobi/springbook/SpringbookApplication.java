package com.tobi.springbook;

import com.tobi.springbook.user.dao.G_applicationContext.CountingDaoFactory;
import com.tobi.springbook.user.dao.G_applicationContext.CountingRepositoryMakerV5;
import com.tobi.springbook.user.dao.G_applicationContext.UserDaoV5;
import com.tobi.springbook.user.domain.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringbookApplication {

  public static void main(String[] args) {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CountingDaoFactory.class);
    UserDaoV5 userDao = applicationContext.getBean("userDaoV5", UserDaoV5.class);
    User user = new User();
    user.setName("SUNBA");
    user.setPassword("COUPLE");

    userDao.add(user);

    System.out.println(user.getName() + " -> 등록 성공");

    User user1 = userDao.get(1L);
    System.out.println(user1.getPassword() + " -> 비번 추출 성공");

    CountingRepositoryMakerV5 countingRepositoryMakerV5 = applicationContext.getBean("getRepositoryMakerV5", CountingRepositoryMakerV5.class);
    int counter = countingRepositoryMakerV5.getCounter();
    System.out.println(counter);


  }

}
