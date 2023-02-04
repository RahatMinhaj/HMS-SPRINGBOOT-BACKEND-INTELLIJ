package com.minhaj.hms.Entity;

import com.minhaj.hms.ICommonInterface.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.sql.Date;

@Entity
@Getter
@Setter
public class Payment extends BaseEntity {


    private Long p_id;
    private String p_name;
    private Long dept_id;
    private Long doc_id;
    private Date admission_date;
    private Date release_date;


    private Long doc_charge;
    private Long ambulance_charge;
    private Long cabin_charge;
    private Long med_charge;
    private Long test_charge;
    private Long ot_charge;
    private Long discount;

    private Long total_bill;
}
