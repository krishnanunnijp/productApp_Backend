package com.example.productApp_Backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {
    @GetMapping("/")
    public  String add(){
        return "this is add page";
    }

}
