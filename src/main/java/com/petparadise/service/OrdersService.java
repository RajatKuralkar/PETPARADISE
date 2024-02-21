package com.petparadise.service;



import com.petparadise.dto.OrdersDTO;
import com.petparadise.entities.Orders;

import java.util.List;

public interface OrdersService {
    List<Orders> displayAllOrders();

    Orders addOrders(OrdersDTO ordr);

    String deleteOrders(Long oid);

}
