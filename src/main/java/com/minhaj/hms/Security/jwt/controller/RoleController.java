package com.minhaj.hms.Security.jwt.controller;


import com.minhaj.hms.Security.jwt.entity.Role;
import com.minhaj.hms.Security.jwt.entity.User;
import com.minhaj.hms.Security.jwt.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
@RestController
@RequestMapping("/usermanagement")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/getuserlist")
    public List<User> getUserList(){
        return roleService.getUserLists();
    }

    @GetMapping("/filterrole/{roleName}")
    public List<User> filterRole(@PathVariable String roleName){
        return roleService.getFilterByRoleList(roleName);
    }




    @PostMapping({"/createNewRole"})
    public Role createNewRole(@RequestBody Role role) {
        return roleService.createNewRole(role);
    }
}
