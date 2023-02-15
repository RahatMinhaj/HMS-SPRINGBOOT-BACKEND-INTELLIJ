package com.minhaj.hms.Controller;

import com.minhaj.hms.DTM.DeleteMessage;
import com.minhaj.hms.Entity.Cabin;
import com.minhaj.hms.ICommonInterface.IController;
import com.minhaj.hms.Service.CabinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200" , allowedHeaders = "*")
@RequestMapping("/cabin")
public class CabinController implements IController<Cabin> {


    @Autowired
    private CabinService cabinService;


    @Override
    public List<Cabin> getList() {
        return null;
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
        return null;
    }

    @Override
    public ResponseEntity<DeleteMessage> deleteByID(Long id) {
        return null;
    }
}
