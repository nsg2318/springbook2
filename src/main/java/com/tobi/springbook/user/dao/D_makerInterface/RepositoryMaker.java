package com.tobi.springbook.user.dao.D_makerInterface;

import com.tobi.springbook.user.repository.Repository;

public interface RepositoryMaker {
  Repository makeRepository();
}
