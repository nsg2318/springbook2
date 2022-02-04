package com.tobi.springbook.user.dao;

import com.tobi.springbook.user.domain.User;
import com.tobi.springbook.user.repository.MemoryRepository;

public class UserDao {

  public void add(User user) {

    //편의상 연결하는 부분
    MemoryRepository memoryRepository = getMemoryRepository();

    //편의상 add 하는 부분
    memoryRepository.add(user);
  }

  public User get(Long id) {

    //편의상 연결하는 부분
    MemoryRepository memoryRepository = getMemoryRepository();

    //편의상 get 하는 부분
    User user = memoryRepository.get(id);
    return user;
  }

  private MemoryRepository getMemoryRepository() {
    return new MemoryRepository();
  }
}

