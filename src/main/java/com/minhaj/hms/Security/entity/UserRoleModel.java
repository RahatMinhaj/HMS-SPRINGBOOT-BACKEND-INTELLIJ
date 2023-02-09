package com.minhaj.hms.Security.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserRoleModel {

    @Id
    private String roleName;
    private String roleDescription;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public UserRoleModel() {
    }
    public UserRoleModel(String roleName) {
        this.roleName = roleName;
    }
}
