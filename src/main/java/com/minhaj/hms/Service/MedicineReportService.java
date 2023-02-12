package com.minhaj.hms.Service;

import com.minhaj.hms.Entity.MedicineReport;
import com.minhaj.hms.ICommonInterface.IService;
import com.minhaj.hms.Repository.MedicineReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineReportService implements IService<MedicineReport> {


    @Autowired
    private MedicineReportRepository medReportRepo;

    @Override
    public List<MedicineReport> getAllLists() {
        return medReportRepo.findAll();
    }

    @Override
    public MedicineReport saveDatas(MedicineReport medicineReport) {
        return medReportRepo.save(medicineReport);
    }

    @Override
    public MedicineReport getByIds(Long id) {
        return null;
    }

    @Override
    public void deleteByIDs(Long id) {

    }

    @Override
    public MedicineReport editByIDs(Long id, MedicineReport medicineReport) {
        return null;
    }
}
