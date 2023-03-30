package com.minhaj.hms.Entity;

import com.minhaj.hms.ICommonInterface.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Date;


@Entity
@Getter
@Setter
public class Doctor extends BaseEntity {

    private String first_name;
    private String last_name;
    private String mobile;
    private Long dept_id;
    private String degree;
    private String specialization;
    private String details;
    private Double visit_charge;
    private Date doc_join_date;
    private String image_path;

//    @ManyToOne(fetch = FetchType.EAGER, optional = true)
//    @JoinColumn(name = "department_id", referencedColumnName = "id", nullable = true)
//    private Departments department;

}
