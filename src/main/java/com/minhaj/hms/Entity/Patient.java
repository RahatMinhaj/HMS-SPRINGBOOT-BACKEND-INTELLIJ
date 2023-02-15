package com.minhaj.hms.Entity;

import com.minhaj.hms.ICommonInterface.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Getter
@Setter
public class Patient extends BaseEntity { private String p_first_name;


   private  String p_last_name;
   private Long p_age;
   private  Long p_weight;
   private  String p_gender;
   private String p_address;
   private  String p_mobile;
   private  String p_imageurl;
  private String p_platform;

//  @OneToOne(cascade = CascadeType.ALL)
//  @JoinColumn(name = "cabin_id")
//  private Cabin cabin;


}
