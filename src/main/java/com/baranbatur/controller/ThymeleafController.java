package com.baranbatur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {

    //http://localhost:8081/thymeleaf1
    @GetMapping("/thymeleaf1")
    public String getThymeleaf() {
        return "thymeleaf1";
    }

}
