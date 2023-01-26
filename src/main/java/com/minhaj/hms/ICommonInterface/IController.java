package com.minhaj.hms.ICommonInterface;


import com.minhaj.hms.Entity.Departments;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface IController<T> {

    @GetMapping("/lists")
    List<Departments> getList();

    @PostMapping("/create")
    public Departments create(@RequestBody T t);




//========================Edit Method: start ===========================
    @GetMapping("/lists/editbyid/{id}")
    Departments getByID(@PathVariable Long id);

    @PutMapping("/lists/edit/{id}")
    Departments editByID(@PathVariable Long id, @RequestBody Departments departments);
    //========================Edit Method: end ===========================
    

    @DeleteMapping("/lists/delete/{id}")
    ResponseEntity<String> deleteByID(@PathVariable Long id);







}
