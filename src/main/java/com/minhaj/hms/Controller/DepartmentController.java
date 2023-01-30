package com.minhaj.hms.Controller;


import com.minhaj.hms.DTM.DeleteMessage;
import com.minhaj.hms.Entity.Departments;
import com.minhaj.hms.ICommonInterface.IController;
import com.minhaj.hms.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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
    public Departments create(Departments departments, MultipartFile image) {
        return null;
    }

    @Override
    public Departments getByID(Long id) {

        return deptService.getByIds(id);
    }

    @Override
    public ResponseEntity<DeleteMessage> deleteByID(Long id) {

        try {
            deptService.deleteByIDs(id);
            return new ResponseEntity<>(new DeleteMessage("Data Deleted Successfully!"), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(new DeleteMessage("Data Deleted is not Success!"), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
//
//    static class  DeleteSuccess{
//       private String message;
//
//        public DeleteSuccess(String message) {
//            this.message = message;
//        }
//
//        public String getMessage() {
//            return message;
//        }
//
//        public void setMessage(String message) {
//            this.message = message;
//        }
//    }

    @Override
    public Departments editByID(Long id, Departments departments) {
//        System.out.println("edit by id method called");
        Departments dept = deptService.editByIDs(id , departments);
//        System.out.println(dept.getDept_name());
        return dept;
    }


}
