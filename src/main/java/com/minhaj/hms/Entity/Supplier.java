package com.minhaj.hms.Entity;

import com.minhaj.hms.ICommonInterface.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Supplier extends BaseEntity {

    private String sup_company_name;
    private String sup_location;
   private String  sup_phone;
    private String sup_email;

}
