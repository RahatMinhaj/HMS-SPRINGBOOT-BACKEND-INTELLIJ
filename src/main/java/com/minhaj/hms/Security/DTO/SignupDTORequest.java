package com.minhaj.hms.Security.DTO;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@RequiredArgsConstructor
public class SignupDTORequest {

    private String userName;


    private String email;

    private String password;

    private Set<String> role;

}
