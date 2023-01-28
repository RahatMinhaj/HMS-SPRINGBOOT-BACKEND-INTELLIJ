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
        return null;
    }

    @Override
    public void deleteByIDs(Long id) {

    }

    @Override
    public Doctor editByIDs(Long id, Doctor doctor) {
        return null;
    }
}
