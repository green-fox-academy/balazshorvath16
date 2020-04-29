package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import com.greenfoxacademy.programmerfoxclub.services.NutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class FoxController {
    private NutritionService nutritionService;
    private FoxService foxService;

    @Autowired
    public FoxController(NutritionService nutritionService, FoxService foxService) {
        this.nutritionService = nutritionService;
        this.foxService = foxService;
    }

    @GetMapping("/nutritionStore")
    public String getNutritionInfo(@RequestParam String name, Model model) {
        model.addAttribute("selectedFox", foxService.getFox(name));
        model.addAttribute("foods", nutritionService.getFoodList());
        model.addAttribute("drinks", nutritionService.getDrinkList());
        return "nutrition";
    }

    public String changeNutrition(@RequestParam String name, Food food, Drink drink) {
        foxService.getFox(name).setFood(food);
        foxService.getFox(name).setDrink(drink);
        return "redirect:/?name=" + name;
    }
}
