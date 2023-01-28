package com.minhaj.hms.Controller;

import com.minhaj.hms.Entity.Doctor;
import com.minhaj.hms.ICommonInterface.IController;
import com.minhaj.hms.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.print.Doc;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/" , allowedHeaders = "*")
@RequestMapping("/doctor")
public class DoctorController implements IController<Doctor> {

    @Autowired
    private DoctorService docService;

    @Override
    public List<Doctor> getList() {
        return docService.getAllLists();
    }

    @Override
    public Doctor create(Doctor doctor) {
        System.out.println(doctor.getFirst_name() + " This is from controller");
//        String ImagePath = "src/main/resources/Images/Doctor/" + image.getOriginalFilename();
//
//        try {
//            Files.copy(image.getInputStream(), Paths.get(ImagePath), StandardCopyOption.REPLACE_EXISTING);
//            doctor.setImage_path(ImagePath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        return docService.saveDatas(doctor);
    }

    @Override
    public Doctor create(Doctor doctor, MultipartFile image) {
        return null;
    }


    @Override
    public Doctor getByID(Long id) {
        return null;
    }

    @Override
    public Doctor editByID(Long id, Doctor doctor) {
        return null;
    }


    @Override
    public ResponseEntity<String> deleteByID(Long id) {
        return null;
    }

//    DoctorService docService;



}
