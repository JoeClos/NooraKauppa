package com.example.noora_kauppa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class DefaultController {
    
    @GetMapping("/index")
    public String showHomePage() {

        return "index";
    }

    @GetMapping("/kahvilaitteet")
    public String showCoffeeMachines() {

        return "kahvilaitteet";
    }

    @GetMapping("/kulutustuotteet")
    public String showProducts() {

        return "kulutustuotteet";
    }
}
