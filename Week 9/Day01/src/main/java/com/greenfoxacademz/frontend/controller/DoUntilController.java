package com.greenfoxacademz.frontend.controller;

import com.greenfoxacademz.frontend.model.DoUntil;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class DoUntilController {

  @PostMapping("/dountil/{action}")
  public ResponseEntity<?> doUntilAction(@PathVariable String aciton, @RequestBody DoUntil doUntil) {
    if (doUntil.getUntil() == 0) {
      return ResponseEntity.ok(new Error("Please provide a number!"));
    }
  }

}
