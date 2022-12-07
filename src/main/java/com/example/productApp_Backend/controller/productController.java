package com.example.productApp_Backend.controller;

import com.example.productApp_Backend.dao.productDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import  com.example.productApp_Backend.model.product;

import java.util.HashMap;
import java.util.List;

@RestController
public class productController {
    @GetMapping("/")
    public  String welcome(){
        return "this is welcome page";
    }
    @Autowired
    private productDao dao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> add(@RequestBody product p) {
        HashMap<String, String> map = new HashMap<>();
        dao.save(p);
        map.put("status","success");
        return map;
    }
    @PostMapping("/search")
    public String search() {
        return "search product page";
    }
    @PostMapping("/edit")
    public String edit() {
        return "search product page";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/product")
    public List<product> view() {
        return (List<product>) dao.findAll();
    }
    @PostMapping("/delete")
    public String delete() {
        return "delete product page";
    }


}
