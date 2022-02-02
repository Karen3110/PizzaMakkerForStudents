package com.example.demo3.service.impl;

import com.example.demo3.model.Order;
import com.example.demo3.model.Product;
import com.example.demo3.model.dto.OrderDto;
import com.example.demo3.repository.OrderRepository;
import com.example.demo3.service.OrderService;
import com.example.demo3.service.ProductService;

import java.util.LinkedList;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository = new OrderRepository();
    private final ProductService productService = new ProductServiceImpl();

    @Override
    public void create(Order order) {
        orderRepository.create(order);
    }

    @Override
    public OrderDto read(int tableId) {
        OrderDto data = new OrderDto();
        List<Order> fromDb = orderRepository.read(tableId);
        data.setTableId(fromDb.get(0).getTableId());
        data.setInProcess(fromDb.get(0).isInProcess());
        data.setQuantity(fromDb.get(0).getQuantity());
        data.setAmount(fromDb.get(0).getAmount());
        data.setProducts(new LinkedList<>());

        fromDb.forEach(item -> {
            Product product = productService.readProduct(item.getProductId());
            data.getProducts().add(product);
        });

        return data;
    }

    @Override
    public List<OrderDto> readAll() {
        List<Order> fromDb = orderRepository.readAll();
        List<OrderDto> data = new LinkedList<>();
        fromDb.forEach(item -> {
            int i = 0;
            for (; i < data.size(); i++) {
                if (data.get(i).getTableId() == item.getTableId()) {
                    break;
                }
            }

            if (i != data.size()) {
                data.get(i).getProducts().add(productService.readProduct(item.getProductId()));
            } else {
                OrderDto orderDto = new OrderDto();
                orderDto.setTableId(item.getTableId());
                orderDto.setInProcess(item.isInProcess());
                orderDto.setQuantity(item.getQuantity());
                orderDto.setAmount(item.getAmount());
                orderDto.setProducts(new LinkedList<>());
                orderDto.getProducts().add(productService.readProduct(item.getProductId()));
            }
            // checked identifier
            item.setId(-1);
        });
        return data;
    }

    @Override
    public Order update(Order order) {
        return orderRepository.update(order);
    }

    @Override
    public void delete(int tableId) {

        orderRepository.delete(tableId);
    }
}
