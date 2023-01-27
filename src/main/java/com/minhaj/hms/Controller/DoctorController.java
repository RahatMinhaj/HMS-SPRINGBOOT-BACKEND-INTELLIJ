package com.minhaj.hms.Controller;

import com.minhaj.hms.Entity.Departments;
import com.minhaj.hms.ICommonInterface.IController;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class DoctorController implements IController {
    @Override
    public List<Departments> getList() {
        return null;
    }

    @Override
    public Departments create(Object o) {
        return null;
    }

    @Override
    public Departments getByID(Long id) {
        return null;
    }

    @Override
    public Departments editByID(Long id, Departments departments) {
        return null;
    }

    @Override
    public ResponseEntity<String> deleteByID(Long id) {
        return null;
    }
}
