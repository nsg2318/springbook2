package com.tobi.springbook.user.dao.test;

import com.tobi.springbook.user.dao.H_setterInjection.DaoFactory;
import com.tobi.springbook.user.dao.H_setterInjection.UserDaoV6;
import com.tobi.springbook.user.domain.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
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

    userDao.deleteAll();

    User user2 = new User();
    user2.setName("클리어후");
    user2.setPassword("클리어후패스");
    userDao.add(user2);

    Assertions.assertThat(userDao.get(1L).getName()).isEqualTo("클리어후");
  }


  @Test
  public void 겟카운트테스트() {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DaoFactory.class);
    UserDaoV6 userDao = applicationContext.getBean("userDaoV6", UserDaoV6.class);

    userDao.deleteAll();
    int count = userDao.getCount();
    System.out.println("count = " + count);

    User user = new User();
    userDao.add(user);
    user.setName("aa");
    user.setPassword("aa");
    System.out.println(userDao.getCount());
  }
}
