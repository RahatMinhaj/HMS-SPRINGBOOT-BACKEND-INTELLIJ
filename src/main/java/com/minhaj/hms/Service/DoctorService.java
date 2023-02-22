package com.minhaj.hms.Service;

import com.minhaj.hms.Entity.Departments;
import com.minhaj.hms.Entity.Doctor;
import com.minhaj.hms.ICommonInterface.IService;
import com.minhaj.hms.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;
@Service
public class DoctorService implements IService<Doctor> {

 @Autowired
 DoctorRepository doctRepo;


    @Override
    public List<Doctor> getAllLists() {
        List<Doctor> dl = doctRepo.findAll();
        List<Doctor> mdl = new ArrayList<>();
        for (Doctor d:dl
             ) {
            if (d.getDepartment()!=null){
                System.out.println("Null Dep");
//                d.setDepartment(null);
                d.getDepartment().setDoctors(null);
                mdl.add(d);
            }

        }
        return mdl;
    }

    @Override
    public Doctor saveDatas(Doctor doctor) {
        return doctRepo.save(doctor);
    }

    @Override
    public Doctor getByIds(Long id) {
        Doctor d = doctRepo.findById(id).get();
        d.getDepartment().setDoctors(null);
        return d;
    }

    @Override
    public void deleteByIDs(Long id) {
         doctRepo.deleteById(id);


    }

    @Override
    public Doctor editByIDs(Long id, Doctor doctor) {
        Doctor dc = doctRepo.findById(id).get();

        dc.setFirst_name(doctor.getFirst_name());
        dc.setLast_name(doctor.getLast_name());
        dc.setMobile(doctor.getMobile());
        dc.setDept_id(doctor.getDept_id());
        dc.setDegree(doctor.getDegree());
        dc.setSpecialization(doctor.getSpecialization());
        dc.setDetails(doctor.getDetails());
        dc.setVisit_charge(doctor.getVisit_charge());
        return doctRepo.save(dc);
    }







    public List<Doctor> getListByDept(Long deptID){
        System.out.println(deptID + "Pring From Service=================");
        return doctRepo.getDept(deptID);
//        return null;
    }




}
