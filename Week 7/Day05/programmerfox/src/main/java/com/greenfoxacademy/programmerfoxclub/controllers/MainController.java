package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import com.greenfoxacademy.programmerfoxclub.services.NutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class MainController {

  private FoxService foxService;
  private NutritionService nutritionService;

  @Autowired
  public MainController(FoxService foxService, NutritionService nutritionService) {
    this.foxService = foxService;
    this.nutritionService = nutritionService;
  }

  @GetMapping("/login")
  public String getLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String getLoginInfo(@RequestParam String name) {
    return "redirect:/?name=" + name;
  }

  @GetMapping("/")
  public String getInfoPage(@RequestParam(required = false) String name, Model model) {
    model.addAttribute("name", name);
    model.addAttribute("selectedFox", foxService.getFox(name));
    model.addAttribute("foods", nutritionService.getFoodList());
    model.addAttribute("drinks", nutritionService.getDrinkList());
    return "index";
  }

  @GetMapping("/trickCenter")
  public String getTricks() {
    return "tricks";
  }

  @PostMapping("/login")
  public String postTricks(@RequestParam String name) {
    return "redirect:/?name=" + name;
  }

}


