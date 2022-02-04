package com.tobi.springbook.user.dao.D_makerInterface;

import com.tobi.springbook.user.repository.Repository;

public class DaumRepositoryMaker implements RepositoryMaker{
  @Override
  public Repository makeRepository() {
    System.out.println("Daum Repository Maker");
    return new Repository();
  }
}
