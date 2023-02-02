package com.minhaj.hms.Repository;

import com.minhaj.hms.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor , Long> {

    @Query(value = "SELECT * FROM Doctor where dept_id = :deptID", nativeQuery = true)
    public List<Doctor> getDept(@Param("deptID") Long deptIDR);


//    public List<Doctor> findAllByDept_id(Long id);
}

