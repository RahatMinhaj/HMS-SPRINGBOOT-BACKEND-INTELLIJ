package com.minhaj.hms.Service;

import com.minhaj.hms.Entity.Doctor;
import com.minhaj.hms.ICommonInterface.IService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestService implements IService<Doctor> {
    @Override
    public List<Doctor> getAllLists() {
        return null;
    }

    @Override
    public Doctor saveDatas(Doctor doctor) {
        return null;
    }

    @Override
    public Doctor getByIds(Long id) {
        return null;
    }


    @Override
    public void deleteByIDs(Long id) {

    }

    @Override
    public Doctor editByIDs(Long id, Doctor doctor) {
        return null;
    }
}
