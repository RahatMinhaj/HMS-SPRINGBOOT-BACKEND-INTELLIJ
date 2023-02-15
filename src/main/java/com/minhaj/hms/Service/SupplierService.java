package com.minhaj.hms.Service;

import com.minhaj.hms.Entity.Supplier;
import com.minhaj.hms.ICommonInterface.IService;
import com.minhaj.hms.Repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService implements IService<Supplier> {


    @Autowired
    private SupplierRepository supRepo;


    @Override
    public List<Supplier> getAllLists() {
        return supRepo.findAll();
    }

    @Override
    public Supplier saveDatas(Supplier supplier) {
        return supRepo.save(supplier);
    }

    @Override
    public Supplier getByIds(Long id) {
        return null;
    }

    @Override
    public void deleteByIDs(Long id) {

    }

    @Override
    public Supplier editByIDs(Long id, Supplier supplier) {
        return null;
    }
}
