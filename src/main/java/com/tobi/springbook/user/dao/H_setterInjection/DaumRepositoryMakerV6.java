package com.tobi.springbook.user.dao.H_setterInjection;

import com.tobi.springbook.user.repository.Repository;

public class DaumRepositoryMakerV6 implements RepositoryMakerV6 {
  @Override
  public Repository makeRepository() {
    System.out.println("Daum Repository Maker");
    return new Repository();
  }
}
