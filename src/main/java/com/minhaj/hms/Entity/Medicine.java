package com.minhaj.hms.Entity;

import com.minhaj.hms.ICommonInterface.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Medicine extends BaseEntity {

    private String med_name;
    private String med_group_name;
    private String med_type;
    private String med_weight;
    private String med_description;
}
