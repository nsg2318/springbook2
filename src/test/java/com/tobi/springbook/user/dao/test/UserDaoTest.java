package com.tobi.springbook.user.dao.test;

import com.tobi.springbook.user.dao.H_setterInjection.DaoFactory;
import com.tobi.springbook.user.dao.H_setterInjection.UserDaoV6;
import com.tobi.springbook.user.domain.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = DaoFactory.class)
public class UserDaoTest {

  private UserDaoV6 userDao;
  private User user;
  private User user1;


  @Autowired
  private AnnotationConfigApplicationContext annotationConfigApplicationContext;

  @BeforeEach
  void setUp() {
//    AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(DaoFactory.class);
    this.userDao = annotationConfigApplicationContext.getBean("userDaoV6", UserDaoV6.class);
    this.user = new User("SUNBA", "COUPLE");
    this.user1 = new User("클리어후", "클리어후패스");


  }

  @Test
  public void 애드와겟() {
    userDao.add(user);
    userDao.deleteAll();
    userDao.add(user1);
    Assertions.assertThat(userDao.get(1L).getName()).isEqualTo("클리어후");
  }


  @Test
  public void 겟카운트테스트() {
    userDao.add(user);
    userDao.deleteAll();
    userDao.add(user1);
    Assertions.assertThat(userDao.getCount()).isEqualTo(1);
  }

  @Test
  public void 예외던지기테스트_Junit5() {
    userDao.add(user);
    userDao.deleteAll();
    userDao.get(1L);
    //???


  }
}
