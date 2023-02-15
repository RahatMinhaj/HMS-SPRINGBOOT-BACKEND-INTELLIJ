package com.minhaj.hms.Service;

import com.minhaj.hms.Entity.CabinAllotment;
import com.minhaj.hms.ICommonInterface.IService;
import com.minhaj.hms.Repository.CabinAllotmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CabinAllotmentService implements IService<CabinAllotment> {

    @Autowired
    private CabinAllotmentRepository allotmentRepo;



    public CabinAllotment changeCabinStatus(Long id){
        CabinAllotment ca = allotmentRepo.findById(id).get();
        ca.setCabin_status("Released");
        return allotmentRepo.save(ca);
    }

    @Override
    public List<CabinAllotment> getAllLists() {
        return allotmentRepo.findAll();
    }

    @Override
    public CabinAllotment saveDatas(CabinAllotment cabinAllotment) {
        return allotmentRepo.save(cabinAllotment);
    }

    @Override
    public CabinAllotment getByIds(Long id) {
        return null;
    }

    @Override
    public void deleteByIDs(Long id) {

    }

    @Override
    public CabinAllotment editByIDs(Long id, CabinAllotment cabinAllotment) {
        return null;
    }
}
