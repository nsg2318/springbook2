package com.tobi.springbook.user.repository;

public class SimpleMemoryRepositoryV2 implements SimpleMemoryRepositoryInterface {
  @Override
  public MemoryRepository makeNewMemoryRepository() {
    System.out.println("난 V2");
    return new MemoryRepository();
  }
}
