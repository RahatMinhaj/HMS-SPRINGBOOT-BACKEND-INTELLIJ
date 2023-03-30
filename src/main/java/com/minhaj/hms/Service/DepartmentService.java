package com.minhaj.hms.Service;


import com.minhaj.hms.Entity.Departments;
import com.minhaj.hms.Entity.Doctor;
import com.minhaj.hms.ICommonInterface.IService;
import com.minhaj.hms.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class DepartmentService implements IService<Departments> {

    @Autowired
    DepartmentRepository deptRepo;

    @Override
    public List<Departments> getAllLists() {
        return deptRepo.findAll();
    }

//    @Override
//    public List<Departments> getAllLists() {
//        List<Departments> dp = deptRepo.findAll();
//        List<Departments> dpt = new ArrayList<>();
//
//        for (Departments dptm : dp){
//            if(dptm.getDoctors() != null){
//                Set<Doctor> docp = new HashSet<>();
//                for (Doctor d: dptm.getDoctors()){
//
//                    d.setDepartment(null);
//                    docp.add(d);
//                }
//                dptm.setDoctors(docp);
//            }
//            dpt.add(dptm);
//        }
//        return dpt;
////        return deptRepo.findAll();
//    }




    @Override
    public Departments saveDatas(Departments departments) {

        return deptRepo.save(departments);
    }



    @Override
    public void deleteByIDs(Long id) {
        deptRepo.deleteById(id);
    }






//======================edit Method: start=========================
    @Override
    public Departments getByIds(Long id) {
        return deptRepo.findById(id).get();
    }

    @Override
    public Departments editByIDs(Long id, Departments departments) {
//         deptRepo.findById(id).get();

        Departments dept = deptRepo.findById(id).get();

//        dept.setId(departments.getId()); It generates an error when trying to edit becasuse it can not be changed because of auto increament
        dept.setDept_name(departments.getDept_name());
        dept.setDept_manager(departments.getDept_manager());
        return deptRepo.save(dept);

//                .map(
//                dept ->{
//                    dept.setDept_name(departments.getDept_name());
//                    dept.setDept_manager(departments.getDept_manager());
//                    return deptRepo.save(departments);
//                }
//        ).orElseGet(
//                ()->{
//                    departments.setId(id);
//                    return deptRepo.save(departments);
//                }
//        );

    }
    //======================edit Method: end=========================




}
