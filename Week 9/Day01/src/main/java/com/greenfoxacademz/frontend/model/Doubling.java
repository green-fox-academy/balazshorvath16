package com.greenfoxacademz.frontend.model;

public class Doubling {

  Integer received;
  Integer result;

  public Integer getReceived() {
    return received;
  }

  public Integer getResult() {
    return result;
  }

  public Doubling(Integer received) {
    this.received = received;
    this.result = received * 2;
  }
}
