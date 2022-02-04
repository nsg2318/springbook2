package com.tobi.springbook.user.dao.E_injection;

import com.tobi.springbook.user.repository.Repository;

public interface RepositoryMakerV3 {
  Repository makeRepository();
}
