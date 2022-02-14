package com.tobi.springbook.user.dao.H_setterInjection;

import com.tobi.springbook.user.repository.Repository;

public interface RepositoryMakerV6 {
  Repository makeRepository();

  void deleteAll();
}
