package com.minhaj.hms.Controller;


import com.minhaj.hms.DTM.DeleteMessage;
import com.minhaj.hms.Entity.Payment;
import com.minhaj.hms.ICommonInterface.IController;
import com.minhaj.hms.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping("/payment")
public class PaymentController implements IController<Payment> {

    @Autowired
    PaymentService pService;


    @Override
    public List<Payment> getList() {
        return pService.getAllLists();
    }

    @Override
    public Payment create(Payment payment) {
        return pService.saveDatas(payment);
    }

    @Override
    public Payment create(Payment payment, MultipartFile image) {
        return null;
    }

    @Override
    public Payment getByID(Long id) {
        return null;
    }

    @Override
    public Payment editByID(Long id, Payment payment) {
        return null;
    }

    @Override
    public ResponseEntity<DeleteMessage> deleteByID(Long id) {
        return null;
    }
}
