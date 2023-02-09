package com.minhaj.hms.Security.service;

import com.minhaj.hms.Security.entity.UserEntity;
import com.minhaj.hms.Security.entity.UserRoleModel;
import com.minhaj.hms.Security.repository.RoleRepository;
import com.minhaj.hms.Security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private RoleRepository roleRepo;

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;
    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }



    public void initRoleAndUser() {

        UserRoleModel adminRole = new UserRoleModel();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin role Description");
        roleRepo.save(adminRole);

        UserRoleModel userRole = new UserRoleModel();
        userRole.setRoleName("User");
        userRole.setRoleDescription("Default role for newly created record");
        roleRepo.save(userRole);

        UserEntity adminUser = new UserEntity();
        adminUser.setUserName("admin12");
        adminUser.setPassword(getEncodedPassword("admin123"));
        adminUser.setUserFirstName("admin");
        adminUser.setUserLastName("admin");
        adminUser.setEmail("admin@gmail.com");
        Set<UserRoleModel> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setUserRoleModel(adminRoles);
        userRepo.save(adminUser);

//        User user = new User();
//        user.setUserName("raj123");
//        user.setUserPassword(getEncodedPassword("raj@123"));
//        user.setUserFirstName("raj");
//        user.setUserLastName("sharma");
//        Set<Role> userRoles = new HashSet<>();
//        userRoles.add(userRole);
//        user.setRole(userRoles);
//        userDao.save(user);
    }


    public UserEntity UserRegistration(UserEntity user){
        UserRoleModel ur = roleRepo.findById("User").get();
        Set<UserRoleModel> userRoles = new HashSet<>();
        userRoles.add(ur);

        user.setUserRoleModel(userRoles);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepo.save(user);

    }





}
