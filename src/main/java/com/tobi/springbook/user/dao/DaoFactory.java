package com.tobi.springbook.user.dao;

import com.tobi.springbook.user.repository.SimpleMemoryRepositoryInterface;
import com.tobi.springbook.user.repository.SimpleMemoryRepositoryV2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DaoFactory {

  @Bean
  public UserDao userDaoBean() {
    SimpleMemoryRepositoryInterface simpleMemoryRepositoryInterface = getSimpleMemoryRepositoryInterface();
    return new UserDao(simpleMemoryRepositoryInterface);
  }

  @Bean
  public SimpleMemoryRepositoryInterface getSimpleMemoryRepositoryInterface() {
    return new SimpleMemoryRepositoryV2();
  }

}
