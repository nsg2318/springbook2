package com.tobi.springbook.user.dao.test;

import com.tobi.springbook.user.dao.H_setterInjection.DaoFactory;
import com.tobi.springbook.user.dao.H_setterInjection.UserDaoV6;
import com.tobi.springbook.user.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserDaoTest {

  @Test
  public void 애드와겟() {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DaoFactory.class);
    UserDaoV6 userDao = applicationContext.getBean("userDaoV6", UserDaoV6.class);
    User user = new User();
    user.setName("SUNBA");
    user.setPassword("COUPLE");

    userDao.add(user);
    System.out.println(user.getName() + " -> 등록 성공");

    User user1 = userDao.get(1L);
//    Assertions.assertThat(user.getName()).isEqualTo(user1.getName());

    userDao.deleteAll();

    User user2 = new User();
    user2.setName("클리어후");
    user2.setPassword("클리어후패스");
    userDao.add(user2);
    System.out.println(userDao.get(1L).getName());
  }
}
