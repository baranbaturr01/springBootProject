package com.baranbatur.controller;

import com.baranbatur.bean.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BeanController {

    @Autowired
    BeanConfig beanConfig;

    //http://localhost:8081/bean/beanDto
    @GetMapping("/bean/beanDto") //aslında bu bir url
    @ResponseBody //html olmadan ekranda göster
    public String getBeanDto() {
        return beanConfig.beanDto().toString();
    }
}
