package com.minhaj.hms.Security.jwt.dto;

import com.minhaj.hms.Security.jwt.entity.Role;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Data
public class SignupRequest {


    private String userName;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    private String userFirstName;
    private String userLastName;
    private String password;
    private LocalDate userDOB;
    private String userLoc;
    private LocalDate userRegistrationDate;
    private String registrationIP;

    private Set<Role> role;





//
//
//
////    @NotBlank
////    @Size(min = 3, max = 20)
//    private String username;
//
////    @NotBlank
////    @Size(max = 50)
////    @Email
//    private String email;
//
//    private Set<String> role;
//
////    @NotBlank
////    @Size(min = 6, max = 40)
//    private String password;
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public Set<String> getRole() {
//        return this.role;
//    }
//
//    public void setRole(Set<String> role) {
//        this.role = role;
//    }
}
