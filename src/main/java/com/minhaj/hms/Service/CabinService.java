package com.minhaj.hms.Service;

import com.minhaj.hms.Entity.Cabin;
import com.minhaj.hms.ICommonInterface.IService;
import com.minhaj.hms.Repository.CabinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CabinService implements IService<Cabin> {


    @Autowired
    private CabinRepository cabinRepo;


    @Override
    public List<Cabin> getAllLists() {
        return cabinRepo.findAll();
    }

    @Override
    public Cabin saveDatas(Cabin cabin) {
        return cabinRepo.save(cabin);
    }

    @Override
    public Cabin getByIds(Long id) {
        return null;
    }

    @Override
    public void deleteByIDs(Long id) {

    }

    @Override
    public Cabin editByIDs(Long id, Cabin cabin) {
        Cabin cb = cabinRepo.findById(id).get();



        return null;
    }
}
