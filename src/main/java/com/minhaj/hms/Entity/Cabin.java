package com.minhaj.hms.Entity;

import com.minhaj.hms.ICommonInterface.BaseEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Cabin extends BaseEntity {

    private String cabin_no;
    private String cabin_type;
    private String floor;
    private Long cabin_fare;
    private String cabin_status;


    @OneToOne(mappedBy = "cabin")
    private Patient patient;

//    @OneToOne
//    @JoinColumn(name = "dep_id")
//    private Departments dep;

//    @OneToOne(fetch = FetchType.LAZY)
//    @MapsId
//    @JoinColumn(name = "patient_id")
//    private Patient patient;

}
