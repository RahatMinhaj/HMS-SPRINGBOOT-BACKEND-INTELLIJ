package com.minhaj.hms.Security.jwt.service;


import com.minhaj.hms.Security.jwt.entity.Role;
import com.minhaj.hms.Security.jwt.entity.User;
import com.minhaj.hms.Security.jwt.repository.RoleDao;
import com.minhaj.hms.Security.jwt.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void initRoleAndUser() {

        Role adminRole = new Role();
        adminRole.setRoleName("Super_Admin");
        adminRole.setRoleDescription("Super Admin role");
        roleDao.save(adminRole);

        Role roleAdmin = new Role();
        roleAdmin.setRoleName("Admin");
        roleAdmin.setRoleDescription("Admin Role For the Hospital Management User");
        roleDao.save(roleAdmin);

        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("Default role for newly created user");
        roleDao.save(userRole);

//        Role roleMODERATOR = new Role();
//        roleMODERATOR.setRoleName("ROLE_MODERATOR");
//        roleMODERATOR.setRoleDescription("Default role for newly ROLE_MODERATOR record");
//        roleDao.save(roleMODERATOR);




        User adminUser = new User();
        adminUser.setUserName("admin123");
        adminUser.setPassword(getEncodedPassword("admin@pass"));
        adminUser.setUserFirstName("admin");
        adminUser.setUserLastName("admin");
        adminUser.setEmail("admin@gmail.com");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(roleAdmin);
        adminUser.setRole(adminRoles);
        userDao.save(adminUser);

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

    public User registerNewUser(User user) {
        Role role = roleDao.findById("User").get();

        Set<Role> userRoles = new HashSet<>();
        userRoles.add(role);

        user.setRole(userRoles);
        user.setPassword(getEncodedPassword(user.getPassword()));

        return userDao.save(user);
    }

    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }
}
