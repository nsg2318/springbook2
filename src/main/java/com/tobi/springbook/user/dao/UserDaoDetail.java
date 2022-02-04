package com.tobi.springbook.user.dao;

import com.tobi.springbook.user.domain.User;
import com.tobi.springbook.user.repository.Repository;

public class UserDaoDetail {

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

  private Repository getRepository() {
    return new Repository();
  }
}

