package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.main.ShopItems;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebshopController {
    ShopItems myShop = new ShopItems();

    @GetMapping("/webshop")
    public String theWebshop(Model model) {
        model.addAttribute(myShop.getShopItems());
        return "webshop";
    }

    @GetMapping("/only-avaiable")
    public String onlyAvaiable(Model model) {
        model.addAttribute(myShop.onlyAvaiable());
        return "webshop";
    }
    @GetMapping("/cheapest")
    public String cheapest(Model model) {
        model.addAttribute(myShop.cheapestOrder());
        return "webshop";
    }

    @GetMapping("/contains-nike")
    public String containsNike(Model model) {
        model.addAttribute(myShop.containsNike());
        return "webshop";
    }

    @GetMapping("/average-stock")
    public String averageStock(Model model) {
        model.addAttribute(myShop.averageStock());
        return "infopage";
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String mostExpensive(@RequestParam("searchInput") String searchInput, Model model) {
        model.addAttribute("info", myShop.search(searchInput));
        return "webshop";
    }

}
