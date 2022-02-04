package com.tobi.springbook.user.dao.F_daoFactory;


import com.tobi.springbook.user.dao.D_makerInterface.RepositoryMaker;

//UserDaoTest(Main) 에서 필요치 않게 책임을 가진 부분 분리
public class DaoFactory {
  public UserDaoV4 userDaoV4() {
    return new UserDaoV4(getRepositoryMakerV4());
  }

  // daoFactory 이후 만약 DAO 가 늘어난다면? 계속 new DaumRepositoryMakerV4를 할 수 없으니, 메서드로 분리해보자
  public AccountDaoV4 accountDaoV4() {
    return new AccountDaoV4(getRepositoryMakerV4());
  }

  public MessageDaoV4 messageDaoV4() {
    return new MessageDaoV4(getRepositoryMakerV4());
  }

  private RepositoryMakerV4 getRepositoryMakerV4() {
    return new DaumRepositoryMakerV4();
  }
}
