package com.minhaj.hms.Controller;

import com.minhaj.hms.Entity.Departments;
import com.minhaj.hms.Entity.Doctor;
import com.minhaj.hms.ICommonInterface.IController;
import com.minhaj.hms.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/" , allowedHeaders = "*")
@RequestMapping("/doctor")
public class DoctorController implements IController<Doctor> {

    @Autowired
    DoctorService docService;



    @Override
    public List<Departments> getList() {
        return null;
    }

    @Override
    public Departments create(Doctor doctor) {
        System.out.println(doctor.getFirst_name() + " This is from controller");
        return docService.saveDatas(doctor);
    }

    @Override
    public Departments getByID(Long id) {
        return null;
    }

    @Override
    public Departments editByID(Long id, Departments departments) {
        return null;
    }

    @Override
    public ResponseEntity<String> deleteByID(Long id) {
        return null;
    }
}
