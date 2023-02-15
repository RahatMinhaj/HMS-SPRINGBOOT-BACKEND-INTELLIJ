package com.minhaj.hms.Controller;

import com.minhaj.hms.DTM.DeleteMessage;
import com.minhaj.hms.Entity.CabinAllotment;
import com.minhaj.hms.ICommonInterface.IController;
import com.minhaj.hms.Service.CabinAllotmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200" , allowedHeaders = "*")
@RequestMapping("/cabinallotment")
public class CabinAllotmentController implements IController<CabinAllotment> {

    @Autowired
    private CabinAllotmentService allotmentService;


    @PutMapping("/statuschange/")
    public CabinAllotment changests(@RequestParam("id") Long id){
        return allotmentService.changeCabinStatus(id);
    }



    @Override
    public List<CabinAllotment> getList() {
        System.out.println("method hit");
        return allotmentService.getAllLists();
    }




    @Override
    public CabinAllotment create(CabinAllotment cabinAllotment) {
        return allotmentService.saveDatas(cabinAllotment);
    }

    @Override
    public CabinAllotment create(CabinAllotment cabinAllotment, MultipartFile image) {
        return null;
    }

    @Override
    public CabinAllotment getByID(Long id) {
        return null;
    }

    @Override
    public CabinAllotment editByID(Long id, CabinAllotment cabinAllotment) {
        return null;
    }

    @Override
    public ResponseEntity<DeleteMessage> deleteByID(Long id) {
        return null;
    }
}
