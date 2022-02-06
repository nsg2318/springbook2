package com.tobi.springbook.user.dao.H_setterInjection;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CountingDaoFactory {

  @Bean
  public UserDaoV6 userDaoV5(){
    return new UserDaoV6(getRepositoryMakerV5());
  }

  @Bean
  public RepositoryMakerV6 getRepositoryMakerV5() {
    return new CountingRepositoryMakerV6(getRealRepositoryMakerV5());
  }

  @Bean
  public RepositoryMakerV6 getRealRepositoryMakerV5() {
    return new DaumRepositoryMakerV6();
  }
}
