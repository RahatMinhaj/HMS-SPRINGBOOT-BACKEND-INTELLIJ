package com.minhaj.hms.Repository;

import com.minhaj.hms.Entity.Appointment;
import com.minhaj.hms.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    @Transactional
    @Modifying
    @Query(value = "update patient set cabin_status =:status where id=:id",nativeQuery = true)
    public void changeStatusRepo(@Param("id") Long id, @Param("status") String status);

}
