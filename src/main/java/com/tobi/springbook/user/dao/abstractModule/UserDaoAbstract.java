package com.tobi.springbook.user.dao.abstractModule;

import com.tobi.springbook.user.domain.User;
import com.tobi.springbook.user.repository.Repository;

public abstract class UserDaoAbstract {
  public void add(User user) {

    //편의상 연결하는 부분
    Repository repository = getRepository();

    //편의상 add 하는 부분
    repository.persist(user);

    //펀의상 연결 끊는 부분
    System.out.println("closed Repository");
  }

  public User get(Long id) {

    //편의상 연결하는 부분
    Repository repository = getRepository();

    //편의상 get 하는 부분
    User user = repository.export(id);

    //펀의상 연결 끊는 부분
    System.out.println("closed Repository");

    return user;
  }
  //연결은 abstract 이러면 얘만 구현해서 UserDao 무한 확장 가능
  public abstract Repository getRepository();
}
