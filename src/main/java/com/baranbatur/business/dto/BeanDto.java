package com.baranbatur.business.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class BeanDto {
    private Long id;
    private String beanName;
    private String beanData;

    //başlangıç
    public void initialBeanMethod() {
        log.info("BeanDto init");
        System.out.println("BeanDto init, Bean başlamadan önce çalışır");
    }

    //son
    public void destroyBeanMethod() {
        log.info("BeanDto destroy");
        System.out.println("BeanDto destroy, Bean sonlandıktan sonra çalışır");
    }
}
