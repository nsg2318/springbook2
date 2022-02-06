package com.tobi.springbook.user.dao.H_setterInjection;


import com.tobi.springbook.user.repository.Repository;

public class CountingRepositoryMakerV6 implements RepositoryMakerV6 {
  static int counter = 0;
  private RepositoryMakerV6 realRepositoryMakerV6;

  public CountingRepositoryMakerV6(RepositoryMakerV6 realRepositoryMakerV6) {
    this.realRepositoryMakerV6 = realRepositoryMakerV6;
  }

  @Override
  public Repository makeRepository() {
    counter++;
    System.out.println(counter+"번 사용되었습니다.");

    return realRepositoryMakerV6.makeRepository();
  }

  public int getCounter(){
    return counter;
  }
}
