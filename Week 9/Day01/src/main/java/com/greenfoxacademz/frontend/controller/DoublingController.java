package com.greenfoxacademz.frontend.controller;

import com.greenfoxacademz.frontend.model.Doubling;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoublingController {

  @GetMapping("/doubling")
  public ResponseEntity<?> doubling(@RequestParam(required = false) Integer input) {
    if (input == null) {
      return ResponseEntity.ok(new Error("Please provide an input!"));
    }
      Doubling doubling = new Doubling(input);
      return ResponseEntity.ok(doubling);
    }
  }

