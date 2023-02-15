package com.minhaj.hms.Controller;

import com.minhaj.hms.DTM.DeleteMessage;
import com.minhaj.hms.Entity.PathologyType;
import com.minhaj.hms.ICommonInterface.IController;
import com.minhaj.hms.Service.PathologyTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200" , allowedHeaders = "*")
@RequestMapping("/pathologytype")
public class PathologyTypeController implements IController<PathologyType> {


    @Autowired
    private PathologyTypeService pathTypeService;


    @Override
    public List<PathologyType> getList() {
        return pathTypeService.getAllLists();
    }

    @Override
    public PathologyType create(PathologyType pathologyType) {
        return pathTypeService.saveDatas(pathologyType);
    }

    @Override
    public PathologyType create(PathologyType pathologyType, MultipartFile image) {
        return null;
    }

    @Override
    public PathologyType getByID(Long id) {
        return null;
    }

    @Override
    public PathologyType editByID(Long id, PathologyType pathologyType) {
        return null;
    }

    @Override
    public ResponseEntity<DeleteMessage> deleteByID(Long id) {
        return null;
    }
}
