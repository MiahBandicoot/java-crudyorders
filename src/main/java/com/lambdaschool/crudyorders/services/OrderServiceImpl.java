package com.lambdaschool.javaorders.services;

import org.springframework.beans.factory.annotation.Autowired;
import com.lambdaschool.javaorders.repositories.PaymentsRepository;
import com.lambdaschool.javaorders.repositories.CustomersRepository;
import com.lambdaschool.javaorders.repositories.OrdersRepository;

public class OrderServiceImpl implements OrdersService{
    @Autowired
    private OrdersRepository ordersrepos;
    @Autowired
    private CustomersRepository custrepos;
    @Autowired
    private PaymentsRepository payrepos;
    @Overide
    public List<Order> findOrdersWithAdvanceAmount();
}
