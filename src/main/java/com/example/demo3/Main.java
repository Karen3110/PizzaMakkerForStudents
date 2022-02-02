package com.example.demo3;

import com.example.demo3.repository.ProductRepository;
import com.example.demo3.service.ProductService;
import com.example.demo3.service.impl.ProductServiceImpl;
import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {

        ProductService productService = new ProductServiceImpl();
        ProductRepository productRepository = new ProductRepository();
        Gson g = new Gson();
        System.out.println(g.toJson(productService.readAll()));
        System.out.println((productRepository.readAll()));
        System.out.println((productRepository.readAll()).get(0));
        System.out.println((productRepository.readAll()).get(1));
        System.out.println((productRepository.readAll()).get(2));


    }


}
