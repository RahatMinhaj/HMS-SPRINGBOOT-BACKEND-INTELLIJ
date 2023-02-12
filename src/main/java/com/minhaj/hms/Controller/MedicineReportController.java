package com.minhaj.hms.Controller;

import com.minhaj.hms.DTM.DeleteMessage;
import com.minhaj.hms.Entity.MedicineReport;
import com.minhaj.hms.ICommonInterface.IController;
import com.minhaj.hms.Service.MedicineReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200" , allowedHeaders = "*")
@RequestMapping("/medicine_report")
public class MedicineReportController implements IController<MedicineReport> {


    @Autowired
    private MedicineReportService medReportService;


    @Override
    public List<MedicineReport> getList() {
        return medReportService.getAllLists();
    }

    @Override
    public MedicineReport create(MedicineReport medicineReport) {
        return medReportService.saveDatas(medicineReport);
    }

    @Override
    public MedicineReport create(MedicineReport medicineReport, MultipartFile image) {
        return null;
    }

    @Override
    public MedicineReport getByID(Long id) {
        return null;
    }

    @Override
    public MedicineReport editByID(Long id, MedicineReport medicineReport) {
        return null;
    }

    @Override
    public ResponseEntity<DeleteMessage> deleteByID(Long id) {
        return null;
    }
}
