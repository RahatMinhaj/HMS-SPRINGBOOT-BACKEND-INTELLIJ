package com.minhaj.hms.Entity;

import com.minhaj.hms.ICommonInterface.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.sql.Date;


@Entity
@Getter
@Setter
public class Doctor extends BaseEntity {

    String first_name;
    String last_name;
    String mobile;
    Long dept_id;
    String degree;
    String specialization;
    String details;
    Double visit_charge;
    Date doc_join_date;



}
