package com.example.expanses;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/ui")
public class ExpanseController {
    @RequestMapping
    public String index(){
        return "Welcome to Expanse Tracker App";
    }
}
