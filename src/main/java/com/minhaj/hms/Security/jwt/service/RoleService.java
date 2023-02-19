package com.minhaj.hms.Security.jwt.service;


import com.minhaj.hms.Security.jwt.entity.Role;
import com.minhaj.hms.Security.jwt.entity.User;
import com.minhaj.hms.Security.jwt.repository.RoleDao;
import com.minhaj.hms.Security.jwt.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private UserDao userDao;





    public List<User> getFilterByRoleList(String roleName){
        return userDao.getFilteredListByRole(roleName);
    }


    public List<User> getUserLists(){


        return (List<User>) userDao.findAll();
    }




    public Role createNewRole(Role role) {
        return roleDao.save(role);
    }
}
