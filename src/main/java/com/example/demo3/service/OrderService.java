package com.example.demo3.service;

import com.example.demo3.model.Order;
import com.example.demo3.model.dto.OrderDto;

import java.util.List;

public interface OrderService {
    void create(Order order);

    OrderDto read(int tableId);

    List<OrderDto> readAll();

    Order update(Order order);

    void delete(int tableId);
}
