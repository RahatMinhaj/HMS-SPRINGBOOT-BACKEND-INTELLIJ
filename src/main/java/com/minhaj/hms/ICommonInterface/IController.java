package com.minhaj.hms.ICommonInterface;


import com.minhaj.hms.Entity.Departments;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface IController<T> {

    @GetMapping("/lists")
    List<Departments> getList();

    @PostMapping("/create")
    public Departments create(@RequestBody T t);

    @GetMapping("/lists/{id}")
    Departments getByID(@PathVariable Long id);


    @DeleteMapping("lists/delete/{id}")
    void deleteByID(@PathVariable Long id);

    @PutMapping("lists/edit/{id}")
    Departments editByID(@PathVariable Long id, @RequestBody Departments departments);





}
