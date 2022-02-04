//package com.tobi.springbook.user.dao.E_injection;
//
//
//import com.tobi.springbook.user.domain.User;
//
//public class UserDaoTest {
//  public static void main(String[] args) {
//    UserDaoV3 userDao = new UserDaoV3(new DaumRepositoryMakerV3());
//    User user = new User();
//    user.setName("SUNBA");
//    user.setPassword("COUPLE");
//
//    userDao.add(user);
//
//    System.out.println(user.getName() + " -> 등록 성공");
//
//    User user1 = userDao.get(1L);
//    System.out.println(user1.getPassword() + " -> 비번 추출 성공");
//  }
//}
