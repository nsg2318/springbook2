package com.tobi.springbook.user.dao;

import com.tobi.springbook.user.repository.SimpleMemoryRepositoryInterface;
import com.tobi.springbook.user.repository.SimpleMemoryRepositoryV2;


public class DaoFactory {
  public UserDao userDao() {
    SimpleMemoryRepositoryInterface simpleMemoryRepositoryInterface = getSimpleMemoryRepositoryInterface();
    return new UserDao(simpleMemoryRepositoryInterface);
  }

  private SimpleMemoryRepositoryInterface getSimpleMemoryRepositoryInterface() {
    return new SimpleMemoryRepositoryV2();
  }

}
