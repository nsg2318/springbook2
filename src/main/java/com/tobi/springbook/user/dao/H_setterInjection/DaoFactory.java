package com.tobi.springbook.user.dao.H_setterInjection;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {

  @Bean
  public UserDaoV6 userDaoV5() {
    return new UserDaoV6(getRepositoryMakerV6());
  }

  @Bean
  public RepositoryMakerV6 getRepositoryMakerV6() {
    return new DaumRepositoryMakerV6();
  }
}
