package com.minhaj.hms.Security.jwt.service;


import com.minhaj.hms.Security.jwt.entity.Role;
import com.minhaj.hms.Security.jwt.entity.User;
import com.minhaj.hms.Security.jwt.repository.RoleDao;
import com.minhaj.hms.Security.jwt.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private UserDao userDao;





    public List<User> getFilterByRoleList(String roleName){
        return userDao.getFilteredListByRole(roleName);
    }

    public User applyRoles(String userName, List<String> roleName){
        User user = userDao.findById(userName).get();
//        Set<Role> userRoles = user.getRole();
        Set<Role> setUserRole = new HashSet<>();

        for(int i = 0; i<roleName.size(); i++){
            Role role = roleDao.findById(roleName.get(i)).get();
            setUserRole.add(role);
            user.setRole(setUserRole);
        }

        return  userDao.save(user);
    }

//    public User applyRoles(String userName, String roleName){
//        Role role = roleDao.findById(roleName).get();
//
//        User user = userDao.findById(userName).get();
//        Set<Role> userRoles = user.getRole();
//
//        Set<Role> setUserRole = new HashSet<>();
//        setUserRole.add(role);
//
//        user.setRole(setUserRole);
//
//
//        System.out.println(user.getUserFirstName());
//        System.out.println(user.getRole());
//
//        return  userDao.save(user);
//    }


    public List<User> getUserLists(){


        return (List<User>) userDao.findAll();
    }




    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
