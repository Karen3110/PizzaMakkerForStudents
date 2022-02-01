package com.example.demo3;

import com.example.demo3.service.ProductService;
import com.example.demo3.service.impl.ProductServiceImpl;
import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {

        ProductService productService = new ProductServiceImpl();
        Gson g = new Gson();
        System.out.println(g.toJson(productService.readAll()));


    }


}
