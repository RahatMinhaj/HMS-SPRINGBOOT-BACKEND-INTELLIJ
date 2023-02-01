package com.minhaj.hms.Repository;

import com.minhaj.hms.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

}
