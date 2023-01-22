package com.minhaj.hms.Controller;


import com.minhaj.hms.Entity.Departments;
import com.minhaj.hms.ICommonInterface.IController;
import com.minhaj.hms.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/" , allowedHeaders = "*")
@RequestMapping("/department")
public class DepartmentController implements IController<Departments> {

    @Autowired
    private DepartmentService deptService;


    @Override
    public List<Departments> getList() {
        System.out.println("get list hitted");
        List<Departments> dp = deptService.getAllLists();
        System.out.println(dp);
        return dp;
    }

    @Override
    public Departments create(Departments departments) {
        System.out.println(departments.getDept_name());
        return deptService.saveDatas(departments);
    }

    @Override
    public Departments getByID(Long id) {
       return deptService.getByIds(id);
    }

    @Override
    public void deleteByID(Long id) {
        deptService.deleteByIDs(id);
    }




    @Override
    public Departments editByID(Long id, Departments departments) {
        Departments dept = deptService.editByIDs(id , departments);
        System.out.println(dept.getDept_name());
        return dept;
    }


}
