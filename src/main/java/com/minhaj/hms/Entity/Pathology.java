package com.minhaj.hms.Entity;

import com.minhaj.hms.ICommonInterface.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Pathology extends BaseEntity {
    private Long p_id;
    private Long pathologist_id;    //should be from employee table where pathologist will be there
    private Long doc_id; ///doct reference id
    private Long pathology_type_id;
    private Long pathology_price;
    private String pathology_desc;


    private LocalDate pathology_date;
}
