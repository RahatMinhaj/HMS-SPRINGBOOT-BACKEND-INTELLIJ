package com.minhaj.hms.Security.jwt.repository;


import com.minhaj.hms.Security.jwt.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
