package com.minhaj.hms.Security.jwt.entity;

import lombok.Data;

@Data
public class JwtRequest {

    private String userName;
    private String password;


}
