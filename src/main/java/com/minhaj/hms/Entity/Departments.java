package com.minhaj.hms.Entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class Departments {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String dept_name;
    private String dept_manager;
//
//    @javax.persistence.OneToOne
//    @JoinColumn(name = "cabin_id")
//    private Cabin cabin;


//    @JsonIgnore
//    @OneToMany(mappedBy = "department", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST, targetEntity = Doctor.class)
////    @ToString.Exclude
//    private Set<Doctor> doctors;

}
