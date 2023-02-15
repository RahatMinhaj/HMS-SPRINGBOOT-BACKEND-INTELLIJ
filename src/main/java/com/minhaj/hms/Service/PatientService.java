package com.minhaj.hms.Service;

import com.minhaj.hms.Entity.Patient;
import com.minhaj.hms.ICommonInterface.IService;
import com.minhaj.hms.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService implements IService<Patient> {

    @Autowired
    PatientRepository patientRepo;

    @Override
    public List<Patient> getAllLists() {
        List<Patient> pt= patientRepo.findAll();
        List<Patient> ptList= new ArrayList<>();

        for (Patient p:pt) {
            if (p.getCabin()!=null){
                p.getCabin().setPatient(null);
            }
            ptList.add(p);
        }
        return ptList;

    }

    @Override
    public Patient saveDatas(Patient patient) {
        System.out.println("hit from patient service");
        return patientRepo.save(patient);
    }

    @Override
    public Patient getByIds(Long id) {
        return patientRepo.findById(id).get();
    }

    @Override
    public void deleteByIDs(Long id) {
        patientRepo.deleteById(id);

    }

    @Override
    public Patient editByIDs(Long id, Patient patient) {
        Patient pt = patientRepo.findById(id).get();

        pt.setP_first_name(patient.getP_first_name());
        pt.setP_last_name(patient.getP_last_name());
        pt.setP_age(patient.getP_age());
        pt.setP_weight(patient.getP_weight());
        pt.setP_gender(patient.getP_gender());
        pt.setP_mobile(patient.getP_mobile());
        pt.setP_address(patient.getP_address());
        pt.setP_platform(patient.getP_platform());

        return patientRepo.save(pt);
    }
}
