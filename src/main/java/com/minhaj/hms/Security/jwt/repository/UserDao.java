package com.minhaj.hms.Security.jwt.repository;


import com.minhaj.hms.Security.jwt.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
