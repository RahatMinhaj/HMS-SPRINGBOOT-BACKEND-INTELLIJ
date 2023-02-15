package com.minhaj.hms.Controller;

import com.minhaj.hms.DTM.DeleteMessage;
import com.minhaj.hms.Entity.Pathology;
import com.minhaj.hms.ICommonInterface.IController;
import com.minhaj.hms.Service.PathologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200" , allowedHeaders = "*")
@RequestMapping("/pathology")
public class PathologyController implements IController<Pathology> {

    @Autowired
    private PathologyService pathService;

    @Override
    public List<Pathology> getList() {
        return pathService.getAllLists();
    }

    @Override
    public Pathology create(Pathology pathology) {
        return pathService.saveDatas(pathology);
    }

    @Override
    public Pathology create(Pathology pathology, MultipartFile image) {
        return null;
    }

    @Override
    public Pathology getByID(Long id) {
        return null;
    }

    @Override
    public Pathology editByID(Long id, Pathology pathology) {
        return null;
    }

    @Override
    public ResponseEntity<DeleteMessage> deleteByID(Long id) {
        return null;
    }
}
