package com.minhaj.hms.Service;

import com.minhaj.hms.Entity.Patient;
import com.minhaj.hms.ICommonInterface.IService;
import com.minhaj.hms.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService implements IService<Patient> {

    @Autowired
    PatientRepository patientRepo;

    @Override
    public List<Patient> getAllLists() {
        return null;
    }

    @Override
    public Patient saveDatas(Patient patient) {
        System.out.println("hit from patient service");
        return patientRepo.save(patient);
    }

    @Override
    public Patient getByIds(Long id) {
        return null;
    }

    @Override
    public void deleteByIDs(Long id) {

    }

    @Override
    public Patient editByIDs(Long id, Patient patient) {
        return null;
    }
}
