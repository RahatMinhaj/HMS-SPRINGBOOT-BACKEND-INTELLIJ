package com.minhaj.hms.Controller;

import com.minhaj.hms.DTM.AppointmentChangeMessage;
import com.minhaj.hms.DTM.DeleteMessage;
import com.minhaj.hms.Entity.Appointment;
import com.minhaj.hms.ICommonInterface.IController;
import com.minhaj.hms.Service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200" , allowedHeaders = "*")
@RequestMapping("/appointment")
public class AppointmentController implements IController<Appointment> {

    @Autowired
    AppointmentService appointService;


    @PutMapping("data/update/{id}")
    public Appointment updateVal(@PathVariable("id") Long id, @RequestBody Appointment apModel){
        return appointService.upVal(id,apModel);
    }

    @GetMapping("data/updateAll")
    public ResponseEntity<AppointmentChangeMessage> updateAllVal(@RequestParam(value = "ids") List<Long> ids, @RequestParam(value = "status") String status){
        Integer updatedDataCount =appointService.upAllVal(ids, status);
//        try {
//            deptService.deleteByIDs(id);
            return new ResponseEntity<>(new AppointmentChangeMessage("Total Row Count: " + updatedDataCount), HttpStatus.OK);
//        } catch (Exception e) {
//            return new ResponseEntity<>(new AppointmentChangeMessage("Data Deleted is not Success!"), HttpStatus.INTERNAL_SERVER_ERROR);
//        }
    }











    @Override
    public List<Appointment> getList() {

        return appointService.getAllLists();
    }

    @GetMapping("/lists/{type}")
    public List<Appointment> getAppointByType(@PathVariable String type){
//        System.out.println(type + "====================iiiiiiiiii");
        return appointService.getAppointByType(type);
    }


@GetMapping("/{userName}/lists")
    public List<Appointment> getAppointByUserName(@PathVariable String userName){
//        System.out.println(type + "====================iiiiiiiiii");
        return appointService.getAppointByuserName(userName);
    }






    @Override
    public Appointment create(Appointment appointment) {

        return appointService.saveDatas(appointment);
    }

    @Override
    public Appointment create(Appointment appointment, MultipartFile image) {
        return null;
    }

    @Override
    public Appointment getByID(Long id) {
        return null;
    }

    @Override
    public Appointment editByID(Long id, Appointment appointment) {
        return null;
    }

    @Override
    public ResponseEntity<DeleteMessage> deleteByID(Long id) {
        return null;
    }
}
