package com.minhaj.hms.Security.controller;

import com.minhaj.hms.Security.DTO.SignupDTORequest;
import com.minhaj.hms.Security.entity.UserEntity;
import com.minhaj.hms.Security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
@RestController
public class UserController {

    @Autowired
    private UserService uService;

    @PostConstruct
    public void initRoleAndUser() {
        uService.initRoleAndUser();
    }




    @PostMapping({"/signup"})
    public UserEntity registerNewUserNew(@RequestBody SignupDTORequest reqFromDTO) {
        UserEntity user = new UserEntity();
        user.setUserName(reqFromDTO.getUserName());
        user.setEmail(reqFromDTO.getEmail());
        user.setPassword(reqFromDTO.getPassword());

        return uService.UserRegistration(user);

    }



//    @GetMapping({"/forAdmin"})
//    @PreAuthorize("hasRole('Admin')")
//    public String forAdmin(){
//        return "This URL is only accessible to the admin";
//    }
//
//    @GetMapping({"/forUser"})
//    @PreAuthorize("hasRole('User')")
//    public String forUser(){
//        return "This URL is only accessible to the user";
//    }
}
