package com.tobi.springbook.user.dao.F_daoFactory;


import com.tobi.springbook.user.domain.User;

public class UserDaoTestV4 {
  public static void main(String[] args) {

    DaoFactory daoFactory = new DaoFactory();
    UserDaoV4 userDao = daoFactory.userDaoV4();

    User user = new User();
    user.setName("SUNBA");
    user.setPassword("COUPLE");

    userDao.add(user);

    System.out.println(user.getName() + " -> 등록 성공");

    User user1 = userDao.get(1L);
    System.out.println(user1.getPassword() + " -> 비번 추출 성공");
  }
}
