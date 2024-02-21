package com.petparadise.controller;

import com.petparadise.dto.OrdersDTO;
import com.petparadise.entities.Orders;
import com.petparadise.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/order")
@CrossOrigin(origins = "http://localhost:3000")
public class OrdersController {

    @Autowired
    private OrdersService ordersservice;

    @GetMapping("/display")
    public List<Orders> displayAllOrders(){
        return ordersservice.displayAllOrders();
    }

    @PostMapping("/add")
    public Orders addOrders(@RequestBody OrdersDTO ordr){
        return ordersservice.addOrders(ordr);
    }

    @DeleteMapping("/delete/orderid/{oid}")
    public String deleteOrders(@PathVariable Long oid){
        return ordersservice.deleteOrders(oid);
    }
}
