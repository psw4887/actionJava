package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/good")
public class GoodController {

    @GetMapping
    String isGet() {

        return "get";
    }//
}
