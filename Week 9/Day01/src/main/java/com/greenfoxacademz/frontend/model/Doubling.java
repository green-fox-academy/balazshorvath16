package com.greenfoxacademz.frontend.model;

public class Doubling {

   private int received;
   private int result;

  public Integer getReceived() {
    return received;
  }

  public Integer getResult() {
    return result;
  }

  public Doubling(int received) {
    this.received = received;
    this.result = received * 2;
  }

  public void setResult(int result) {
    this.result=result;
  }

  public void setReceived() {
    this.received = received;
  }
}
