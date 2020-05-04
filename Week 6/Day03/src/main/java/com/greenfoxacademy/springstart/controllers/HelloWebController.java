package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

  String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj",
      "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
      "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló",
      "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
      "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry",
      "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
      "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem",
      "Sawubona"};
  int random = 0;

  @RequestMapping("/web/greeting")
  public String greeting(Model model,
      @RequestParam(defaultValue = "User", required = false) String name,
      @RequestParam(defaultValue = "12", required = false) String fontSize,
      @RequestParam(defaultValue = "#FFFFFF", required = false) String color) {
    random = (int) (Math.random() * hellos.length);
    model.addAttribute("hellos", hellos[random]);
    model.addAttribute("name", name);
    model.addAttribute("fontSize", fontSize);
    model.addAttribute("color", color);
    return "greeting";
  }
}

