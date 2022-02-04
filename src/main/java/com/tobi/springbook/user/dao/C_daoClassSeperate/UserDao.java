package com.tobi.springbook.user.dao.C_daoClassSeperate;

import com.tobi.springbook.user.domain.User;
import com.tobi.springbook.user.repository.Repository;

public class UserDao {

  //이렇게 RepositoryMaker를 알고있으므로 확장시에 UserDao코드가 변경되어야한다. RepositoryMakerV1, V2 ... and so on
  private final SimpleRepositoryMaker simpleRepositoryMaker;

  public UserDao() {
    this.simpleRepositoryMaker = new SimpleRepositoryMaker();
  }

  public void add(User user) {

    //편의상 연결하는 부분
    Repository repository = simpleRepositoryMaker.makeNewRepository();
    //편의상 add 하는 부분
    repository.persist(user);

    //펀의상 연결 끊는 부분
    System.out.println("closed Repository");
  }

  public User get(Long id) {

    //편의상 연결하는 부분
    Repository repository = simpleRepositoryMaker.makeNewRepository();

    //편의상 get 하는 부분
    User user = repository.export(id);

    //펀의상 연결 끊는 부분
    System.out.println("closed Repository");

    return user;
  }

}

