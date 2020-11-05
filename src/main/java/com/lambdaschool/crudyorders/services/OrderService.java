package com.lambdaschool.javaorders.services;

import java.util.List;
import com.lambdaschool.javaorders.models.Order;
public interface OrderService {
    List<Order> findOrdersWithAdvanceAmount();
    Order findOrdersById(long id);
}
