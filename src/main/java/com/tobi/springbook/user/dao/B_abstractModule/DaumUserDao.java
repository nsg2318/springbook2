package com.tobi.springbook.user.dao.B_abstractModule;

import com.tobi.springbook.user.repository.Repository;

public class DaumUserDao extends UserDaoAbstract{

  //연결 방식 구체화
  @Override
  public Repository getRepository() {
    System.out.println("Daum 연결 방식");
    return new Repository();
  }
}
