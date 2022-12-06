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

    @PostMapping("/add")
    public String add() {
        return "search product page";
    }
    @PostMapping("/search")
    public String search() {
        return "search product page";
    }
    @PostMapping("/edit")
    public String edit() {
        return "search product page";
    }
    @GetMapping("/product")
    public String view() {
        return "view product page";
    }
    @PostMapping("/delete")
    public String delete() {
        return "delete product page";
    }


}
