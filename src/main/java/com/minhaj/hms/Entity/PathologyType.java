package com.minhaj.hms.Entity;

import com.minhaj.hms.ICommonInterface.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class PathologyType extends BaseEntity {

    private String pathology_name;
    private String pathology_desc;
    private Long pathology_price;
}
