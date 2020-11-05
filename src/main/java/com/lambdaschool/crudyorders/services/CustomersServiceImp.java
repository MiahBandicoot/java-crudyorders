package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import com.lambdaschool.javaorders.repositories.CustomersRepository;
import com.lambdaschool.javaorders.repositories.PaymentRepository;
public class CustomersServiceImp implements CustomersService {
    @Autowired
    private CustomersRepository custrepos;
    @Autowired
    private PaymentRepository paymentrepos;

}
