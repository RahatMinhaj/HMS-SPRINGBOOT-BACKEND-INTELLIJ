package com.minhaj.hms.Entity;

import com.minhaj.hms.ICommonInterface.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class MedicineReport extends BaseEntity {

    private Long med_id;
    private String med_company;
    private Long med_quantity;
    private String med_courty;
    private LocalDate med_manufacture_date;
    private LocalDate med_expiry_date;
    private Long supplier_id;
    private Long med_price;
}
