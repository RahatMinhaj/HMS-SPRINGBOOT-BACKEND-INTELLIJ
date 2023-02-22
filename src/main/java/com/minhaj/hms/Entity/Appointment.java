package com.minhaj.hms.Entity;

import com.minhaj.hms.ICommonInterface.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.sql.Date;

@Entity
@Getter
@Setter
public class Appointment extends BaseEntity {


    private Long apSerial; /* Should be auto increment on daily basis*/;
    private Long p_id;
    private String p_type;

    private String apFirstName;
    private String apLastName;
    private String apMobile;
    private Date apDate;
    // appointment_type!:string;
    private Date apEntryDate;
    private Long dept_id;
    private String doc_id;
    private String apLocation;
    private String apGender;
    private Long apAge;
    private String apDeseaseDetails;
    private Long emp_id;
    private String apStatus;

    private String appointmentuserName;

}
