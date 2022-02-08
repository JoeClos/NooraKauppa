package com.example.noora_kauppa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.ui.Model;




@Controller
public class OsastoController {
    @Autowired
    private OsastoRepository osastoRepository;

   

    @GetMapping("/index")
    public String showList(Model model) {
        model.addAttribute("showPage", osastoRepository.findAll());
        return "index";
    }


    
}
