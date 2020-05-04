package com.greenfoxacademy.dependencyinjection.colors;


import com.greenfoxacademy.dependencyinjection.model.Printer;
import org.springframework.beans.factory.annotation.Autowired;

public class BlueColor implements MyColor {

  private Printer printer;

  @Autowired
  public BlueColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("It is blue in color...");
  }
}