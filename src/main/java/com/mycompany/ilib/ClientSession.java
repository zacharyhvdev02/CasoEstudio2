package com.mycompany.ilib;

public class ClientSession {
  private static ClientSession instance;

  private int userId = -1;

  private ClientSession() {
  }

  public static ClientSession getInstance() {
    if (instance == null) {
      instance = new ClientSession();
    }
    return instance;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }
}
