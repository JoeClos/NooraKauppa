package com.example.noora_kauppa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;



public class ValmistajaController {
    @Autowired ValmistajaRepository valmistajaRepository;

    @GetMapping("/showValmistajat")
    public String showForm(Model model) {
        Valmistaja valmistaja = new Valmistaja();
        model.addAttribute("almistaja", valmistaja);
        return "valmistajat";
    }
}
