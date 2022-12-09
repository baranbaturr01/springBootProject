package com.baranbatur.bean;

import com.baranbatur.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BeanConfig {

    @Bean
    public BeanDto beanDto() {
        return BeanDto.builder().id(0L).beanName("beanName").beanData("beanData").build();
    }
}
