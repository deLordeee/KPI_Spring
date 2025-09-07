package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/info")
public class InfoController {

    @GetMapping("/")
    public String General(){

        return"index";
    }

    @GetMapping("/Kolesnyk")
    public String InfoKolesnyk(){

           return"Kolesnyk";
    }

    @GetMapping("/Butkevych")
    public String InfoButkevych(){

        return"Butkevych";
    }

}
