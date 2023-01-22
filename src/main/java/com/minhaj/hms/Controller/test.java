package com.minhaj.hms.Controller;

import com.minhaj.hms.Entity.Departments;
import com.minhaj.hms.ICommonInterface.IController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tsp")
public class test implements IController<Departments> {


    @Override
    public List<Departments> getList() {
        return null;
    }

    @Override
    public Departments create(Departments departments) {
        return null;
    }

    @Override
    public Departments getByID(Long id) {
        return null;
    }

    @Override
    public void deleteByID(Long id) {

    }
}
