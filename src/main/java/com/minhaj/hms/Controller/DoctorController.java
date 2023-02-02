package com.minhaj.hms.Controller;

import com.minhaj.hms.DTM.DeleteMessage;
import com.minhaj.hms.Entity.Doctor;
import com.minhaj.hms.ICommonInterface.IController;
import com.minhaj.hms.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/", allowedHeaders = "*")
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
        return docService.getByIds(id);
    }

    @Override
    public Doctor editByID(Long id, Doctor doctor) {
        System.out.println("edit by id called");
        Doctor dc = docService.editByIDs(id, doctor);
        System.out.println("edit by id called 2");
        return dc;
    }


    @Override
    public ResponseEntity<DeleteMessage> deleteByID(Long id) {
//        System.out.println("del method called");
        try {
            docService.deleteByIDs(id);
            return new ResponseEntity<>(new DeleteMessage("Data Deleted, Message From SpringBoot!"), HttpStatus.OK);
        } catch (Exception e) {
//            System.out.println("Generating erro");
            return new ResponseEntity<>(new DeleteMessage("Data is not Deleted!, Message From SpringBoot! "), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }





    @GetMapping("/lists/dept/{deptID}")
    public List<Doctor> getByDept(@PathVariable Long deptID ){
//        System.out.println("Pring from controller==============");
        return docService.getListByDept(deptID);

    }







}
