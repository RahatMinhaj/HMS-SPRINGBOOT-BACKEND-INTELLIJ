package com.minhaj.hms.Repository;

import com.minhaj.hms.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    @Query(value = "select * from appointment where ap_status = :apType",nativeQuery = true)
    public List<Appointment> getAppoinListBy(@Param("apType") String type);


}
