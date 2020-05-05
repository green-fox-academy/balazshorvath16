package com.greenfoxacademz.frontend.controller;

import com.greenfoxacademz.frontend.model.AppendA;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class AppendController {

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<?> appendAble(@PathVariable String appendable) {
    AppendA appendA = new AppendA(appendable);
    return ResponseEntity.ok(appendA);
  }
}
