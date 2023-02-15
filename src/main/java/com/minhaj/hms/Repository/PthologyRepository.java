package com.minhaj.hms.Repository;

import com.minhaj.hms.Entity.Pathology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PthologyRepository extends JpaRepository<Pathology , Long> {
}
