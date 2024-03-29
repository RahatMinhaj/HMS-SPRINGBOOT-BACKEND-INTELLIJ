package com.minhaj.hms.Service;

import com.minhaj.hms.Entity.Doctor;
import com.minhaj.hms.Entity.Medicine;
import com.minhaj.hms.ICommonInterface.IService;
import com.minhaj.hms.Repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineService implements IService<Medicine> {

    @Autowired
    private MedicineRepository medRepo;




    @Override
    public List<Medicine> getAllLists() {
        return medRepo.findAll();
    }

    @Override
    public Medicine saveDatas(Medicine medicine) {
        return medRepo.save(medicine);
    }

    @Override
    public Medicine getByIds(Long id) {
        Medicine med = medRepo.findById(id).get();
        return med;
    }

    @Override
    public void deleteByIDs(Long id) {

    }

    @Override
    public Medicine editByIDs(Long id, Medicine medicine) {
        return null;
    }
}
