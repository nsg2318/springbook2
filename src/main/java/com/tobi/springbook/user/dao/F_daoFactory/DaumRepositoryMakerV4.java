package com.tobi.springbook.user.dao.F_daoFactory;

import com.tobi.springbook.user.dao.D_makerInterface.RepositoryMaker;
import com.tobi.springbook.user.repository.Repository;

public class DaumRepositoryMakerV4 implements RepositoryMakerV4 {
  @Override
  public Repository makeRepository() {
    System.out.println("Daum Repository Maker");
    return new Repository();
  }
}
