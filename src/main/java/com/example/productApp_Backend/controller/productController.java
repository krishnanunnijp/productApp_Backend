package com.example.productApp_Backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {
    @GetMapping("/")
    public  String welcome(){
        return "this is welcome page";
    }
    @PostMapping("/search")
    public String search() {
        return "search product page";
    }
    @PostMapping("/edit")
    public String edit() {
        return "search product page";
    }


}
