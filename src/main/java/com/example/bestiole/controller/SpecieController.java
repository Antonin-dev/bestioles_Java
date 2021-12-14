package com.example.bestiole.controller;

import com.example.bestiole.domain.Specie;
import com.example.bestiole.service.SpecieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class SpecieController {
    @Autowired
    SpecieService service;

    @GetMapping("/")
    public String init(Model model) {
        List<Specie> sps = service.list();
        model.addAttribute("species", sps);
        return "list_specie";
    }
}
