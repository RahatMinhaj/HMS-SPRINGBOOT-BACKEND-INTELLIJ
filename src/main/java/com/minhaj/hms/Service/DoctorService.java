package com.minhaj.hms.Service;

import com.minhaj.hms.Entity.Departments;
import com.minhaj.hms.Entity.Doctor;
import com.minhaj.hms.ICommonInterface.IService;
import com.minhaj.hms.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DoctorService implements IService<Doctor> {

 @Autowired
 DoctorRepository doctRepo;





    @Override
    public List<Departments> getAllLists() {
        return null;
    }

    @Override
    public Departments saveDatas(Doctor doctor) {
        return null;
    }

    @Override
    public Departments getByIds(Long id) {
        return null;
    }

    @Override
    public void deleteByIDs(Long id) {

    }

    @Override
    public Departments editByIDs(Long id, Departments departments) {
        return null;
    }
}
