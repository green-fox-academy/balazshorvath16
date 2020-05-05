package com.greenfoxacademz.frontend.model;

public class DoUntil {

  private Integer until;
  private Integer result;


  public DoUntil(Integer until) {
    this.until = until;
  }

  public int getUntil() {
    return until;
  }

  public void setUntil(Integer until) {
    this.until = until;
  }

  public int getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public DoUntil(){
  }

  public void factorialAction() {
    this.result = 1;
    for (int i = 0; i < this.until; i++) {
      this.result *= i;
    }
  }

  public void sumAction() {
    this.result = 0;
    for (int i = 0; i < this.until; i++) {
      this.result += i;
    }
  }
}
