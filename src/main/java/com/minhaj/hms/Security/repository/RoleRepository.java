package com.minhaj.hms.Security.repository;


import com.minhaj.hms.Security.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {
}
