package com.petparadise.service;

import com.petparadise.dao.OrdersDao;
import com.petparadise.dao.UsersDao;
import com.petparadise.dto.OrdersDTO;
import com.petparadise.entities.Orders;
import com.petparadise.entities.Users;
import com.petparadise.dto.OrdersDTO;
import com.petparadise.entities.Orders;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService{
    @Autowired
    private OrdersDao ordersdao;

    @Autowired
    private UsersDao usersdao;

    @Autowired
    private ModelMapper modelmapper;

    @Override
    public List<Orders> displayAllOrders() {
        return ordersdao.findAllOrdersNonValues();
    }
    @Override
    public Orders addOrders(OrdersDTO ordr) {
    Users u= usersdao.findById(ordr.getUserId()).orElseThrow();
    Orders o=modelmapper.map(ordr,Orders.class);
    if(u!=null){
        u.addOrders(o);
        o.setUsers(u);
    }
    return ordersdao.save(o);
    }

    @Override
    public String deleteOrders(Long oid) {
        Orders orders=new Orders();
        orders.setOrderId(oid);
        ordersdao.delete(orders);
        return "Order deleted with id : "+oid;
    }

}