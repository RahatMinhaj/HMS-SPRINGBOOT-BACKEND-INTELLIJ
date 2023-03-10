package com.minhaj.hms.Controller;

import com.minhaj.hms.DTM.DeleteMessage;
import com.minhaj.hms.Entity.Supplier;
import com.minhaj.hms.ICommonInterface.IController;
import com.minhaj.hms.Service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200" , allowedHeaders = "*")
@RequestMapping("/supplier")
public class SupplierController implements IController<Supplier> {


    @Autowired
    private SupplierService supService;

    @Override
    public List<Supplier> getList() {
        return supService.getAllLists();
    }

    @Override
    public Supplier create(Supplier supplier) {
        return supService.saveDatas(supplier);
    }

    @Override
    public Supplier create(Supplier supplier, MultipartFile image) {
        return null;
    }

    @Override
    public Supplier getByID(Long id) {
        return null;
    }

    @Override
    public Supplier editByID(Long id, Supplier supplier) {
        return null;
    }

    @Override
    public ResponseEntity<DeleteMessage> deleteByID(Long id) {
        return null;
    }
}
