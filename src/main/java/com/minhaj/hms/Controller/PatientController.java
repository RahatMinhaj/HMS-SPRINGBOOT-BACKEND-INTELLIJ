package com.minhaj.hms.Controller;

import com.minhaj.hms.Entity.Patient;
import com.minhaj.hms.ICommonInterface.IController;
import com.minhaj.hms.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/" , allowedHeaders = "*")
@RequestMapping("/patient")
public class PatientController implements IController<Patient> {
    @Autowired
    PatientService patientService;



    @Override
    public List<Patient> getList() {
        return null;
    }

    @Override
    public Patient create(Patient patient) {
        return patientService.saveDatas(patient);
    }

    @Override
    public Patient create(Patient patient, MultipartFile image) {
        return null;
    }

    @Override
    public Patient getByID(Long id) {
        return null;
    }

    @Override
    public Patient editByID(Long id, Patient patient) {
        return null;
    }

    @Override
    public ResponseEntity<String> deleteByID(Long id) {
        return null;
    }
}
