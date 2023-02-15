package com.minhaj.hms.Repository;

import com.minhaj.hms.Entity.CabinAllotment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabinAllotmentRepository extends JpaRepository<CabinAllotment, Long> {
}
