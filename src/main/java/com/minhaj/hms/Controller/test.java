package com.minhaj.hms.Controller;

import com.minhaj.hms.DTM.DeleteMessage;
import com.minhaj.hms.Entity.Departments;
import com.minhaj.hms.ICommonInterface.IController;
import com.minhaj.hms.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/tsp")
public class test implements IController<Departments> {

    @Autowired
    TestService ts;




    @Override
    public List<Departments> getList() {
        return null;
    }

    @Override
    public Departments create(Departments departments) {
        return null;
    }

    @Override
    public Departments create(Departments departments, MultipartFile image) {
        return null;
    }


    @Override
    public Departments getByID(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<DeleteMessage> deleteByID(Long id) {

        return null;
    }

    @Override
    public Departments editByID(Long id, Departments departments) {
        return null;
    }
}
