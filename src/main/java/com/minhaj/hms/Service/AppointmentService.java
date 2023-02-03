package com.minhaj.hms.Service;

import com.minhaj.hms.Entity.Appointment;
import com.minhaj.hms.ICommonInterface.IService;
import com.minhaj.hms.Repository.AppointmentRepository;
import com.minhaj.hms.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService implements IService<Appointment> {

    @Autowired
    AppointmentRepository appointRepo;


    @Override
    public List<Appointment> getAllLists() {

        return appointRepo.findAll();
    }

    public List<Appointment> getAppointByType(String type){
//        System.out.println(type  + " ===========================type");
return appointRepo.getAppoinListBy(type);
    }







    @Override
    public Appointment saveDatas(Appointment appointment) {
        return appointRepo.save(appointment);
    }

    @Override
    public Appointment getByIds(Long id) {
        return null;
    }

    @Override
    public void deleteByIDs(Long id) {

    }

    @Override
    public Appointment editByIDs(Long id, Appointment appointment) {
        return null;
    }
}
