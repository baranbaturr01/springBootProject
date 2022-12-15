package com.baranbatur.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfiguration {

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
//    }

//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
//
//        authenticationManagerBuilder.inMemoryAuthentication().withUser("user").password("{noop}password").roles("USER");
//    }

//    @Autowired
//    public void configureGlobalEncrypt(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
//
//        PasswordEncoder encoder =  PasswordEncoderFactories().createDelegatingPasswordEncoder();
//        authenticationManagerBuilder.inMemoryAuthentication().withUser("user").password(encoder.encode("{noop}password")).roles("USER");
//    }
}
