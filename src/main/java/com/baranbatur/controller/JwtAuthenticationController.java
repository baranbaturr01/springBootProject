package com.baranbatur.controller;

import com.baranbatur.business.dto.UserDto;
import com.baranbatur.business.services.impl.JwtUserDetailService;
import com.baranbatur.data.entity.UserEntity;
import com.baranbatur.utils.jwt.JwtToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class JwtAuthenticationController {


    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtToken jwtTokenUtil;

    @Autowired
    private JwtUserDetailService userDetailsService;


    @PostMapping(value = "/register")
    public ResponseEntity<?> saveUser(@RequestBody UserDto user) throws Exception {

        return ResponseEntity.ok(userDetailsService.save(user));

    }

    @PostMapping(value = "/login")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody UserDto authenticationRequest) throws Exception {

        authenticate(authenticationRequest.getUsername(), authenticationRequest.getPassword());
        final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
        final String token = jwtTokenUtil.generateToken(userDetails);
        return ResponseEntity.ok(new UserDto(authenticationRequest.getUsername(), token));
    }

    private void authenticate(String username, String password) throws Exception {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (Exception ex) {
            throw new Exception("inavalid username/password");
        }
    }

}
