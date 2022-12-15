package com.baranbatur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing(auditorAwareRef = "auditorAware") //Auditing
//security inactived
@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class, org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class})

public class SpringbootKodluyoruzApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootKodluyoruzApplication.class, args);
    }
}
