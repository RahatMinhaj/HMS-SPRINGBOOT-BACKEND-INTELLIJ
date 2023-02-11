package com.minhaj.hms.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200/" , allowedHeaders = "*")
@RequestMapping("/supplier")
public class SupplierController {

    @GetMapping("test")
    public String testMe(){

        System.out.println("testing skdflsjfdlkaldkfs");
        return "test Succedd";
    }
}
