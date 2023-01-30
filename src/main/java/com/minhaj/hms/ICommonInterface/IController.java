package com.minhaj.hms.ICommonInterface;


import com.minhaj.hms.DTM.DeleteMessage;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IController<T> {

    @GetMapping("/lists")
    List<T> getList();

    @PostMapping("/create")
    public T create(@RequestBody T t);

    @PostMapping("/createwithimage")
    public T create(@RequestBody T t, @RequestParam("image") MultipartFile image);




//========================Edit Method: start ===========================
    @GetMapping("/lists/editbyid/{id}")
    T getByID(@PathVariable Long id);

    @PutMapping("/lists/update/{id}")
    T editByID(@PathVariable Long id, @RequestBody T t);
    //========================Edit Method: end ===========================
    

    @DeleteMapping("/lists/delete/{id}")
    ResponseEntity<DeleteMessage> deleteByID(@PathVariable Long id);







}
