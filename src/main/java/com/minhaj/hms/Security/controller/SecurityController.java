package com.minhaj.hms.Security.controller;

import com.minhaj.hms.Security.DTO.JwtRequest;
import com.minhaj.hms.Security.DTO.JwtResponse;
import com.minhaj.hms.Security.DTO.LoginDTORequest;
import com.minhaj.hms.Security.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
//@CrossOrigin("*")
@RestController
@RequestMapping("/api/auth")
public class SecurityController {


    @Autowired
    private SecurityService sService;

    @GetMapping("/testmap")
    public String test(){
        System.out.println("hwllo controller");
        return "String returned from test";
    }






    @PostMapping({"/signing"})
    public JwtResponse createJwtToken22(@RequestBody LoginDTORequest loginRequest) throws Exception {
        System.out.println("Test Action");
//        (@RequestBody JwtRequest jwtRequest)
        JwtRequest jwtRequest = new JwtRequest();

        jwtRequest.setUserName(loginRequest.getUserName());
        jwtRequest.setUserPassword(loginRequest.getUserPassword());


        return sService.createJwtToken(jwtRequest);
    }



}
