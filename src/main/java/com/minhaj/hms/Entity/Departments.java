package com.minhaj.hms.Entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Departments {

    private
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String dept_name;
    private String dept_manager;

}
