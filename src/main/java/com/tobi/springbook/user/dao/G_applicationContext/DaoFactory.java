package com.tobi.springbook.user.dao.G_applicationContext;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {

  @Bean
  public UserDaoV5 userDaoV5() {
    return new UserDaoV5(getRepositoryMakerV5());
  }

  @Bean
  public RepositoryMakerV5 getRepositoryMakerV5() {
    return new DaumRepositoryMakerV5();
  }
}
