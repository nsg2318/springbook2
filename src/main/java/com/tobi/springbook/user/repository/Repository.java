package com.tobi.springbook.user.repository;

import com.tobi.springbook.user.domain.User;

import java.util.HashMap;
import java.util.Map;

public class Repository {
  private static final Map<Long, User> store = new HashMap<>();
  private static long sequence = 0L;

  public User persist(User user) {
    user.setId(++sequence);
    store.put(user.getId(), user);
    return user;
  }

  public User export(Long userId) {
    User user = store.get(userId);
    return user;
  }
}
