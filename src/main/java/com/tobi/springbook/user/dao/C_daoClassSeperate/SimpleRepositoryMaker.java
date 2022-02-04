package com.tobi.springbook.user.dao.C_daoClassSeperate;

import com.tobi.springbook.user.repository.Repository;

public class SimpleRepositoryMaker {
  public Repository makeNewRepository(){
    System.out.println("새로운 클래스를 활용함");
    return new Repository();
  }
}
