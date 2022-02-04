package com.tobi.springbook.user.dao.E_injection;

import com.tobi.springbook.user.dao.D_makerInterface.RepositoryMaker;
import com.tobi.springbook.user.domain.User;
import com.tobi.springbook.user.repository.Repository;

public class UserDaoV3 {


  //인터페이스로 확장가능하게.
  private final RepositoryMaker repositoryMaker;

  //생성자를 통한 외부 주입
  public UserDaoV3(RepositoryMaker repositoryMaker) {
    this.repositoryMaker = repositoryMaker;
  }

  public void add(User user) {

    //편의상 연결하는 부분
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

