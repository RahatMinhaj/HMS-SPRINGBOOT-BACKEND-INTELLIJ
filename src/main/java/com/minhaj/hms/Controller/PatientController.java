package com.minhaj.hms.Controller;

import com.minhaj.hms.DTM.DeleteMessage;
import com.minhaj.hms.DTM.Messages;
import com.minhaj.hms.Entity.Patient;
import com.minhaj.hms.ICommonInterface.IController;
import com.minhaj.hms.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200" , allowedHeaders = "*")
@RequestMapping("/patient")
public class PatientController implements IController<Patient> {
    @Autowired
    PatientService patientService;

    @GetMapping("updatecabin/")
    public ResponseEntity<Messages> changeCabinStatus(@RequestParam("pid") Long id , @RequestParam("status") String status ) {
        System.out.println("method hitted with parametre :          " + id + status);

        try {
            patientService.changeCabinStatuss(id, status);
            return new ResponseEntity<>(new Messages("Cabin Status Updated!"),HttpStatus.OK);

        }catch (Exception e) {
            return new ResponseEntity<>(new Messages("Cabin Status is Not Updated!"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }





    @Override
    public List<Patient> getList() {

        return patientService.getAllLists();
    }





    @Override
    public Patient create(Patient patient) {
        return patientService.saveDatas(patient);
    }

    @Override
    public Patient create(Patient patient, MultipartFile image) {
        return null;
    }

    @Override
    public Patient getByID(Long id) {

        return patientService.getByIds(id);
    }

    @Override
    public Patient editByID(Long id, Patient patient) {

        return patientService.editByIDs(id, patient);
    }

    @Override
    public ResponseEntity<DeleteMessage> deleteByID(Long id) {
        try {
            patientService.deleteByIDs(id);
            return new ResponseEntity<>(new DeleteMessage("Data Deleted, Message From SpringBoot!"), HttpStatus.OK);
        } catch (Exception e) {
//            System.out.println("Generating erro");
            return new ResponseEntity<>(new DeleteMessage("Data is not Deleted!, Message From SpringBoot! "), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
