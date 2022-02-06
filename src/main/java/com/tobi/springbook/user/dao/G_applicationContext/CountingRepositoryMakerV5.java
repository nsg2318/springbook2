package com.tobi.springbook.user.dao.G_applicationContext;


import com.tobi.springbook.user.repository.Repository;

public class CountingRepositoryMakerV5  implements RepositoryMakerV5{
  static int counter = 0;
  private RepositoryMakerV5 realRepositoryMakerV5;

  public CountingRepositoryMakerV5(RepositoryMakerV5 realRepositoryMakerV5) {
    this.realRepositoryMakerV5 = realRepositoryMakerV5;
  }

  @Override
  public Repository makeRepository() {
    counter++;
    System.out.println(counter+"번 사용되었습니다.");

    return realRepositoryMakerV5.makeRepository();
  }

  public int getCounter(){
    return counter;
  }
}
