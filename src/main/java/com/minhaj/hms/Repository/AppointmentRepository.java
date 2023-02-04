package com.minhaj.hms.Repository;

import com.minhaj.hms.Entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    @Query(value = "select * from appointment where ap_status = :apType",nativeQuery = true)
    public List<Appointment> getAppoinListBy(@Param("apType") String type);

    @Transactional
    @Modifying
    @Query(value = "update appointment set ap_status =:status where id in ( :ids )",nativeQuery = true)
    public Integer updateAllData(@Param("ids") List<Long> ids, @Param("status") String status);


//    @Transactional
//    @Modifying
//    @Query(value = "update appointment set ap_status ='Confirmed' where id in (22,23,24,25,26)",nativeQuery = true)
//    public void updateAllData();
}
