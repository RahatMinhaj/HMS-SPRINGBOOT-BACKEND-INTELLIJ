package com.minhaj.hms.Service;

import com.minhaj.hms.Entity.Departments;
import com.minhaj.hms.Entity.Doctor;
import com.minhaj.hms.ICommonInterface.IService;
import com.minhaj.hms.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoctorService implements IService<Doctor> {

 @Autowired
 DoctorRepository doctRepo;


    @Override
    public List<Doctor> getAllLists() {
        return doctRepo.findAll();
    }

    @Override
    public Doctor saveDatas(Doctor doctor) {
        return doctRepo.save(doctor);
    }

    @Override
    public Doctor getByIds(Long id) {

        return doctRepo.findById(id).get();
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
}
