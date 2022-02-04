package com.tobi.springbook.user.dao.D_makerInterface;

import com.tobi.springbook.user.domain.User;
import com.tobi.springbook.user.repository.Repository;

public class UserDaoV2 {


  //인터페이스로 확장가능하게.
  private final RepositoryMaker repositoryMaker;

  //그치면 여긴 구현체가 직접적으로 나옴
  public UserDaoV2() {this.repositoryMaker = new DaumRepositoryMaker();}

  public void add(User user) {

    //편의상 연결하는 부분
    //인터페이스에 명시된 메서드명이므로, 구현체는 무조건 makeRepository 라는 이름의 메서드로 구현해야함. 따라서 바뀔 걱정 X
    Repository repository = repositoryMaker.makeRepository();
    //편의상 add 하는 부분
    repository.persist(user);

    //펀의상 연결 끊는 부분
    System.out.println("closed Repository");
  }

  public User get(Long id) {

    //편의상 연결하는 부분
    Repository repository = repositoryMaker.makeRepository();

    //편의상 get 하는 부분
    User user = repository.export(id);

    //펀의상 연결 끊는 부분
    System.out.println("closed Repository");

    return user;
  }

}

