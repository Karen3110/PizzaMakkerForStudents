package com.example.demo3;

import com.example.demo3.service.OrderService;
import com.example.demo3.service.impl.OrderServiceImpl;
import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {
        OrderService orderService = new OrderServiceImpl();

//        System.out.println(new Gson().toJson(orderService.read(1)));
        System.out.println(new Gson().toJson(orderService.readAll()));

//
//        OrderRepository orderRepository = new OrderRepository();
//        ProductService productService = new ProductServiceImpl();

    }


}
