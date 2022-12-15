package com.baranbatur.utils.jwt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;
    private String password;
}
