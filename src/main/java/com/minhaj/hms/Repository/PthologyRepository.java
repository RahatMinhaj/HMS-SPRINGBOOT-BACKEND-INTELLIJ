package com.minhaj.hms.Repository;

import com.minhaj.hms.Entity.Pathology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PthologyRepository extends JpaRepository<Pathology , Long> {

    @Query(value = "SELECT * FROM pathology where  patient_id =:id", nativeQuery = true)
    public List<Pathology> getAllByID(@Param("id") Long id);
}
