package com.greenfoxacademz.frontend.controller;

import com.greenfoxacademz.frontend.model.Doubling;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoublingController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(required = false) Integer input) {

    if (input != null) {
      return new Doubling(input);
    } else {
      return new Error("Please provide an input!");
    }
  }
}
