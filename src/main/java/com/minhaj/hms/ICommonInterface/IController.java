package com.minhaj.hms.ICommonInterface;


import com.minhaj.hms.Entity.Departments;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IController<T> {

    @GetMapping("/lists")
    List<Departments> getList();

    @PostMapping("/create")
    public Departments create(@RequestBody T t);





}
