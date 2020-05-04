package com.greenfoxacademy.dependencyinjection.colors;

import com.greenfoxacademy.dependencyinjection.model.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class YellowColor implements MyColor {

  private Printer printer;

  @Autowired
  public YellowColor(Printer printer) {
    this.printer = printer;
  }

  @Override
  public void printColor() {
    printer.log("It is yellow in color...");
  }
}
