package com.minhaj.hms.Entity;

import com.minhaj.hms.ICommonInterface.BaseEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class CabinAllotment extends BaseEntity {

    private Long p_id;
    private String p_name;
    private Long cabin_id;
    private Long doc_id;
    private LocalDate allotment_date;
    private LocalDate discharge_date;
    private String cabin_status;
}
