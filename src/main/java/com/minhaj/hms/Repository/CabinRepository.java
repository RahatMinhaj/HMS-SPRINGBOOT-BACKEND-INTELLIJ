package com.minhaj.hms.Repository;

import com.minhaj.hms.Entity.Cabin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CabinRepository extends JpaRepository<Cabin, Long> {
}
