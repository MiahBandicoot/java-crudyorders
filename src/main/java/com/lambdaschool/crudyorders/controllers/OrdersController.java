package com.lambdaschool.javaorders.controllers;

import com.lambdaschool.javaorders.models.Order;
import com.lambdaschool.javaorders.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

public class OrdersController {
    @Autowired
    OrderService ordersService;
    @GetMapping(value = "/order/{ordernum}",produces = "{application/json}")
    public ResponseEntity<?> getOrderByNumber(@PathVariable long ordernum){
        Order o = ordersService.findOrderById(ordernum);
        return new ResponseEntity<>(o, HttpStatus.OK);
    }
    @GetMapping(value = "/orders/order/{id}", produces = "{application/json}")
    public ResponseEntity<?> getOrdersById(@PathVariable long ordnum){
    Order o = ordersService.findOrderbyOrderId(ordnum);
    return new ResponseEntity<>(o, HttpStatus.OK);
    }

    @PostMapping(value = "/order", consumes = {"application/json"}, produces = {"application/json"})
    public ResponseEntity<?> addNewOrder(@Valid @RequestBody Order newOrder){
        newOrder.setOrdnum(0);
        new Order = ordersService.save(newOrder);
        HttpHeaders responseHeaders = new HttpHeaders();
        URI newOrderURI = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{ordernum}")
            .buildAndExpand(newOrder.getOrdnum())
            .toUri();
        responseHeaders.setLocation(newOrderURI);
        return new ResponseEntity<>(null,responseHeaders, HttpStatus.CREATED);
    }
    @PutMapping(value = "/order/{id}", consumes = {"application/json"}, produces = {"application/json"})
    public ResponseEntity<?> updateOrder(@RequestBody Order updateOrder, @PathVariable long id){
        updateOrder.setOrdnum(id);
        ordersService.save(updateOrder);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
