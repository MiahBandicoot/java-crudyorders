package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Customer

import java.util.List;

public interface CustomersService {
    List<Customer> findAllCustomers();
    List<Customer> findByCustomerName(String custname);
}
