package com.minhaj.hms.Service;


import com.minhaj.hms.Entity.Departments;
import com.minhaj.hms.ICommonInterface.IService;
import com.minhaj.hms.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentService implements IService<Departments> {

    @Autowired
    DepartmentRepository deptRepo;

    @Override
    public List<Departments> getAllList() {
        return deptRepo.findAll();
    }


    @Override
    public Departments saveData(Departments departments) {
        return deptRepo.save(departments);
    }



}
