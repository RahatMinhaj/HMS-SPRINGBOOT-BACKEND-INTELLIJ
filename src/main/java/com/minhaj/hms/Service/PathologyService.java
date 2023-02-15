package com.minhaj.hms.Service;

import com.minhaj.hms.Entity.Pathology;
import com.minhaj.hms.ICommonInterface.IService;
import com.minhaj.hms.Repository.PthologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PathologyService implements IService<Pathology> {
    @Autowired
    private PthologyRepository pathRepo;


    @Override
    public List<Pathology> getAllLists() {
        return pathRepo.findAll();
    }

    @Override
    public Pathology saveDatas(Pathology pathology) {
        return pathRepo.save(pathology);
    }

    @Override
    public Pathology getByIds(Long id) {
        return null;
    }

    @Override
    public void deleteByIDs(Long id) {

    }

    @Override
    public Pathology editByIDs(Long id, Pathology pathology) {
        return null;
    }
}
