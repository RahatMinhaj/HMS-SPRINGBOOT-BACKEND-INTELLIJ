package com.minhaj.hms.Security.jwt.repository;


import com.minhaj.hms.Security.jwt.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao extends CrudRepository<User, String> {

    @Query(value = "SELECT * FROM USER JOIN user_role ON user.user_name = user_role.user_id WHERE role_id =:role" , nativeQuery = true)
    public List<User> getFilteredListByRole(@Param("role") String role);


}
