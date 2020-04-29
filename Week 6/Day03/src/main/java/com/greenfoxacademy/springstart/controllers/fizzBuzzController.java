package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class fizzBuzzController {
  AtomicLong counter = new AtomicLong(1);

  @RequestMapping("/web/fizzbuzzwoof")
  public String fizzBuzz(Model model) {
    long num = counter.getAndIncrement();
    String names= "";
    int fontSize = 10;
    if (num % 3 == 0 && num % 5 == 0 && num % 7 == 0){
      names = "FizzBuzzWoof";
      fontSize = 72;
    } else if (num % 5 == 0 && num % 7 == 0) {
      names = "BuzzWoof";
      fontSize = 48;
    } else if ( num % 5 == 0 && num % 3 == 0) {
      names = "FizzWoof";
      fontSize = 24;
    } else if (num % 3 == 0) {
      names = "Fizz";
    } else if (num % 5 == 0) {
      names = "Buzz";
    } else if (num % 7 == 0) {
      names = "Woof";
    } else {
      names = Long.toString(num);
    }
    model.addAttribute("names", names);
    model.addAttribute("fontSize", fontSize);
    return "fizzBuzz";
  }

}
