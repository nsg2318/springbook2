package com.tobi.springbook.user.dao.H_setterInjection;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {

  @Bean
  public UserDaoV6 userDaoV6() {
    UserDaoV6 userDaoV6 = new UserDaoV6();
    userDaoV6.setRepositoryMaker(getRepositoryMakerV6());
    return userDaoV6;
  }

  @Bean
  public RepositoryMakerV6 getRepositoryMakerV6() {
    return new DaumRepositoryMakerV6();
  }
}
