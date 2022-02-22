package com.tobi.springbook.user.domain;



public class User {
  Long id;
  String name;
  String password;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public User(String name, String password) {
    this.name = name;
    this.password = password;
  }
}
