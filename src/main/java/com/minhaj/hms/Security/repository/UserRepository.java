package com.minhaj.hms.Security.repository;

import com.minhaj.hms.Security.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {
}
