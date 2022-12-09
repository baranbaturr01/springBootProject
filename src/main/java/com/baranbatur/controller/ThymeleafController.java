package com.baranbatur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {

    //http://localhost:8081/thymeleaf1
    @GetMapping("/thymeleaf1")
    public String getThymeleaf() {
        return "thymeleaf1";
    }

    //http://localhost:8081/thymeleaf2
    @GetMapping("/thymeleaf2")
    //Model parametresi thymeleaf a göndermek istediğimiz datayı içerir.
    public String getThymeleaf2Model(Model model) {

        model.addAttribute("key_model", "Ben modelden geldim");//bu değer html sayfasına gönderilir orada yakalamk için key kullanılır
        model.addAttribute("key_model2", "Ben modelden geldim2");//bu değer html sayfasına gönderilir orada yakalamk için key kullanılır

        return "thymeleaf1"; //eğer templates altında başka bir klasör içerisindeki başka bir html sayfasına gitmek istiyorsak oradaki html sayfasının adını yazmamız yeterlidir(klasör_adı/html_sayfası). Ex. return "thymeleaf2/thymeleaf2";
    }

}
