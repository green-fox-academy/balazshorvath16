package com.greenfoxacademz.frontend.controller;

import com.greenfoxacademz.frontend.model.Greeter;
import org.graalvm.compiler.asm.amd64.AMD64VectorAssembler.VexRROp;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class GreeterController {

  @GetMapping("/greeter")
  public ResponseEntity<?> greeter(@RequestParam(required = false) String name,
      @RequestParam(required = false) String title) {
    if (name == null && title == null) {
      return ResponseEntity.badRequest().body(new Error("Please provide a name and a title!"));
    } else if (name == null) {
      return ResponseEntity.badRequest().body(new Error("Please provide a name!"));
    } else if (title == null) {
      return ResponseEntity.badRequest().body(new Error("Please provide a title!"));
    } else {
      Greeter greeting = new Greeter(name, title);
      return ResponseEntity.ok(greeting);
    }
  }
}
