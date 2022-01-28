package com.tobi.springbook.user.repository;

public class SimpleMemoryRepositoryV3 implements SimpleMemoryRepositoryInterface {
  int counter = 0;
  private final SimpleMemoryRepositoryInterface realSimpleMemoryRepositoryInterface;

  public SimpleMemoryRepositoryV3(SimpleMemoryRepositoryInterface realSimpleMemoryRepositoryInterface) {
    this.realSimpleMemoryRepositoryInterface = realSimpleMemoryRepositoryInterface;
  }

  @Override
  public MemoryRepository makeNewMemoryRepository() {
    this.counter++;
    return realSimpleMemoryRepositoryInterface.makeNewMemoryRepository();
  }

  public int getCounter() {
    return counter;
  }
}
