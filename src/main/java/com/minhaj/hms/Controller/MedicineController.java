package com.minhaj.hms.Controller;


import com.minhaj.hms.DTM.DeleteMessage;
import com.minhaj.hms.Entity.Medicine;
import com.minhaj.hms.ICommonInterface.IController;
import com.minhaj.hms.Service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/" , allowedHeaders = "*")
@RequestMapping("/medicine")
public class MedicineController implements IController<Medicine> {


    @Autowired
    private MedicineService medService;


    @Override
    public List<Medicine> getList() {
        return null;
    }


    @Override
    public Medicine create(Medicine medicine) {

        System.out.println(medicine.getMed_name() + "      ======================Printed====");

        return medService.saveDatas(medicine);
    }

    @Override
    public Medicine create(Medicine medicine, MultipartFile image) {
        return null;
    }

    @Override
    public Medicine getByID(Long id) {
        return null;
    }

    @Override
    public Medicine editByID(Long id, Medicine medicine) {
        return null;
    }

    @Override
    public ResponseEntity<DeleteMessage> deleteByID(Long id) {
        return null;
    }
}
