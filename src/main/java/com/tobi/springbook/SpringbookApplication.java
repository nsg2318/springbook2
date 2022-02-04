//package com.tobi.springbook;
//
//import com.tobi.springbook.user.dao.D_makerInterface.UserDaoV2;
//import com.tobi.springbook.user.domain.User;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class SpringbookApplication {
//
//	public static void main(String[] args) {
//
//		UserDaoV2 userDao = new UserDaoV2();
//		User user = new User();
//		user.setName("SUNBA");
//		user.setPassword("COUPLE");
//
//		userDao.add(user);
//
//		System.out.println(user.getName()+" -> 등록 성공");
//
//		User user1 = userDao.get(1L);
//		System.out.println(user1.getPassword()+ " -> 비번 추출 성공");
//	}
//
//}
