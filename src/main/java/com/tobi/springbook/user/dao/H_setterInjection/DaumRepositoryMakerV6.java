package com.tobi.springbook.user.dao.H_setterInjection;

import com.tobi.springbook.user.repository.Repository;

public class DaumRepositoryMakerV6 implements RepositoryMakerV6 {
  Repository repository;
  @Override
  public Repository makeRepository() {
    System.out.println("Daum Repository Maker");
    repository = new Repository();
    return repository;
  }

  @Override
  public void deleteAll() {
    System.out.println("deleteAll");
    repository.deleteAll();
  }
}
