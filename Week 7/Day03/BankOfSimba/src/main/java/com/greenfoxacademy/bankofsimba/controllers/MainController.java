package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.models.GoodOrBad;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    List<BankAccount> bankAccounts = new ArrayList<>();

    public MainController() {
        bankAccounts.add(new BankAccount("Timon", 10000, "meerkat", false, true));
        bankAccounts.add(new BankAccount("Zordon", 20000, "lion", false, false));
        bankAccounts.add(new BankAccount("Mufasa", 30000, "lion", true, true));
        bankAccounts.add(new BankAccount("Pumba", 15000, "warthog", false, true ));
        bankAccounts.add(new BankAccount("Kovu", 3000, "lion", false, false));
    }

    @GetMapping(path = "/show")
    public String show(Model model) {
        BankAccount myBankAccount = new BankAccount("Simba", 5000, "lion", false, true);
        model.addAttribute("myBankAccounts", myBankAccount);
        return "show";
    }

    @GetMapping(path = "/htmlCeption")
    public String htmlCeption(Model model) {
        String HTMLception = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("HTMLception", HTMLception);
        return "htmlCeption";
    }

    @GetMapping(path="/fillingMultipleAccounts")
    public String fillingMultipleAccounts(Model model) {
        model.addAttribute("bankAccounts", bankAccounts);
        model.addAttribute("emptyAccount", new BankAccount("",0,"",false, false));
        return "fillingMultipleAccounts";
    }

    @PostMapping(path = "/addmoney")
    public String raiseMoney(@RequestParam int raise) {
        int raising = 10;
        if (bankAccounts.get(raise).isKing()) {
            raising = 100;
        }
        bankAccounts.get(raise).setBalance(bankAccounts.get(raise).getBalance());
        return "redirect:/fillingMultipleAccounts";
    }

    @PostMapping(path = "/addaccount")
    public String addAccount(@ModelAttribute BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
        return "redirect:/fillingMultipleAccounts";
    }

}
