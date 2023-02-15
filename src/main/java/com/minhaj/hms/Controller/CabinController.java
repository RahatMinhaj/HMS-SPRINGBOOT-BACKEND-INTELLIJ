package com.minhaj.hms.Controller;

import com.minhaj.hms.DTM.DeleteMessage;
import com.minhaj.hms.Entity.Cabin;
import com.minhaj.hms.Entity.Doctor;
import com.minhaj.hms.ICommonInterface.IController;
import com.minhaj.hms.Service.CabinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200" , allowedHeaders = "*")
@RequestMapping("/cabin")
public class CabinController implements IController<Cabin> {


    @Autowired
    private CabinService cabinService;


    @Override
    public List<Cabin> getList() {
        List<Cabin> cabins = cabinService.getAllLists();
        List<Cabin> cabinList = new ArrayList<>();
        for (Cabin c : cabins
        ){
            if (c.getPatient()!=null){
                c.getPatient().setCabin(null);
            }
            cabinList.add(c);
        }

        return cabinList;

//        return cabins;
    }

    @Override
    public Cabin create(Cabin cabin) {
        return cabinService.saveDatas(cabin);
    }

    @Override
    public Cabin create(Cabin cabin, MultipartFile image) {
        return null;
    }

    @Override
    public Cabin getByID(Long id) {
        return null;
    }

    @Override
    public Cabin editByID(Long id, Cabin cabin) {

        System.out.println("edit by id called");
        Cabin cb = cabinService.editByIDs(id, cabin);
        System.out.println("edit by id called 2");
        return cb;
    }

    @Override
    public ResponseEntity<DeleteMessage> deleteByID(Long id) {
        return null;
    }
}
