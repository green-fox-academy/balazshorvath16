package com.greenfoxacademz.frontend.model;

public class AppendA {

  private String appenda;

  public String getAppenda() {
    return appenda;
  }

  public void setAppenda(String appenda) {
    this.appenda = appenda;
  }

  public AppendA(String appenda) {
        this.appenda = appenda + "a";
      }
}
