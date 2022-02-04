package com.tobi.springbook.user.dao.abstractModule;

import com.tobi.springbook.user.repository.Repository;

public class NaverUserDao extends UserDaoAbstract{

  //연결 방식 구체화
  @Override
  public Repository getRepository() {
    System.out.println("Naver 연결 방식");
    return new Repository();
  }
}
