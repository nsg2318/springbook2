package com.tobi.springbook.user.dao.G_applicationContext;

import com.tobi.springbook.user.repository.Repository;

public class DaumRepositoryMakerV5 implements RepositoryMakerV5 {
  @Override
  public Repository makeRepository() {
    System.out.println("Daum Repository Maker");
    return new Repository();
  }
}
