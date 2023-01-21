package com.minhaj.hms.ICommonInterface;

import com.minhaj.hms.Entity.Departments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IRepository extends JpaRepository<Departments , Long> {



}
