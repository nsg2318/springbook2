package com.tobi.springbook;

import com.tobi.springbook.new_Start.dao.UserDao;
import com.tobi.springbook.new_Start.domain.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class SpringbookApplication {

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    UserDao userDao = new UserDao();
    User user = new User();
    user.setId("aaa");
    user.setName("bbb");
    user.setPassword("ccc");

    userDao.add(user);



    SpringApplication.run(SpringbookApplication.class,args);
  }
}
