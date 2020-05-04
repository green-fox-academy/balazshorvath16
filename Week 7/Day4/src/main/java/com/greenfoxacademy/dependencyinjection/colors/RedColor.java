package com.greenfoxacademy.dependencyinjection.colors;

import com.greenfoxacademy.dependencyinjection.model.Printer;
import org.springframework.beans.factory.annotation.Autowired;

public class RedColor implements MyColor {

  private Printer printer;

  @Autowired
  public RedColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("It is red in color...");
  }
}
