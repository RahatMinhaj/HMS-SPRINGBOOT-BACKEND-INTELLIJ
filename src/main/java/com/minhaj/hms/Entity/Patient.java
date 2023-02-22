package com.minhaj.hms.Entity;

import com.minhaj.hms.ICommonInterface.BaseEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Patient extends BaseEntity {

   private String p_first_name;
   private  String p_last_name;
   private Long p_age;
   private  Long p_weight;
   private  String p_gender;
   private String p_address;
   private  String p_mobile;
   private  String p_imageurl;
   private String p_platform;
   private String cabin_status;



    @OneToOne
    @JoinColumn(name = "cabin_id", referencedColumnName = "id")
    private Cabin cabin;



//
//
//    @OneToMany(mappedBy = "patient")
//    private List<Pathology> pathology;

//    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY,
//            cascade = CascadeType.ALL)
//    @ToString.Exclude
//    private Set<Pathology> pathologies;
}
