package com.greenfoxacademy.dependencyinjection;

import com.greenfoxacademy.dependencyinjection.colors.MyColor;
import com.greenfoxacademy.dependencyinjection.model.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyinjectionApplication implements CommandLineRunner {

  private MyColor color;
  private Printer printer;

  @Autowired
  public DependencyinjectionApplication(MyColor color, Printer printer) {
    this.color = color;
    this.printer = printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(DependencyinjectionApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    color.printColor();

  }
}
