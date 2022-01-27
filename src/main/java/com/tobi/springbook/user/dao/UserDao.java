package com.tobi.springbook.user.dao;

import com.tobi.springbook.user.domain.User;
import com.tobi.springbook.user.repository.MemoryRepository;
import com.tobi.springbook.user.repository.SimpleMemoryRepositoryInterface;

public class UserDao {

  private final SimpleMemoryRepositoryInterface simpleMemoryRepositoryInterface;

  public UserDao(SimpleMemoryRepositoryInterface simpleMemoryRepositoryInterface) {
    this.simpleMemoryRepositoryInterface = simpleMemoryRepositoryInterface;
  }

  public void add(User user) {
    MemoryRepository memoryRepository = simpleMemoryRepositoryInterface.makeNewMemoryRepository();
    memoryRepository.add(user);
  }

  public User get(Long userId) {
    MemoryRepository memoryRepository = simpleMemoryRepositoryInterface.makeNewMemoryRepository();
    User user = memoryRepository.get(userId);
    System.out.println(user.getName());
    return user;
  }

}
