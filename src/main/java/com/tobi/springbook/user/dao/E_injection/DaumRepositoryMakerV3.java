package com.tobi.springbook.user.dao.E_injection;

import com.tobi.springbook.user.repository.Repository;

public class DaumRepositoryMakerV3 implements RepositoryMakerV3 {
  @Override
  public Repository makeRepository() {
    System.out.println("Daum Repository Maker");
    return new Repository();
  }
}
