package com.minhaj.hms.Service;

import com.minhaj.hms.Entity.Payment;
import com.minhaj.hms.ICommonInterface.IService;
import com.minhaj.hms.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService implements IService<Payment> {


    @Autowired
    PaymentRepository pRepo;

    @Override
    public List<Payment> getAllLists() {
        return pRepo.findAll();
    }

    @Override
    public Payment saveDatas(Payment payment) {
        return pRepo.save(payment);
    }

    @Override
    public Payment getByIds(Long id) {
        return null;
    }

    @Override
    public void deleteByIDs(Long id) {

    }

    @Override
    public Payment editByIDs(Long id, Payment payment) {
        return null;
    }
}
