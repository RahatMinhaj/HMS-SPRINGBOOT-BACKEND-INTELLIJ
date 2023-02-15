package com.minhaj.hms.Service;

import com.minhaj.hms.Entity.PathologyType;
import com.minhaj.hms.ICommonInterface.IService;
import com.minhaj.hms.Repository.PathologyTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PathologyTypeService implements IService<PathologyType> {



    @Autowired
    private PathologyTypeRepository pathTypeRepo;

    @Override
    public List<PathologyType> getAllLists() {
        return pathTypeRepo.findAll();
    }

    @Override
    public PathologyType saveDatas(PathologyType pathologyType) {
        return pathTypeRepo.save(pathologyType);
    }

    @Override
    public PathologyType getByIds(Long id) {
        return null;
    }

    @Override
    public void deleteByIDs(Long id) {

    }

    @Override
    public PathologyType editByIDs(Long id, PathologyType pathologyType) {
        return null;
    }
}
