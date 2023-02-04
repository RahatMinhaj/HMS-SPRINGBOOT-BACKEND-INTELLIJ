package com.minhaj.hms.Repository;

import com.minhaj.hms.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

        @Query(value = "SELECT * FROM demo.payment p join doctor d", nativeQuery = true)
        public List<Payment> getAllDataWihJoin();
}
