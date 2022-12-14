package com.baranbatur.bean;

import com.baranbatur.business.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class BeanConfig {

    @Bean(initMethod = "initialBeanMethod", destroyMethod = "destroyBeanMethod")
    @Scope("singleton")
    public BeanDto beanDto() {
        return BeanDto.builder().id(0L).beanName("beanName").beanData("beanData").build();
    }
}
