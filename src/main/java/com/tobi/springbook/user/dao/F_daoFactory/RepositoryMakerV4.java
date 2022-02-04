package com.tobi.springbook.user.dao.F_daoFactory;

import com.tobi.springbook.user.repository.Repository;

public interface RepositoryMakerV4 {
  Repository makeRepository();
}
