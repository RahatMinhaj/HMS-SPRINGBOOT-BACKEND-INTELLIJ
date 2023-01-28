package com.minhaj.hms.Repository;

import com.minhaj.hms.Entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Departments , Long> {
}
