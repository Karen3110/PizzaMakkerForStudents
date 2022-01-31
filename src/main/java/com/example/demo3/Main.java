package com.example.demo3;

import com.example.demo3.repository.ProductRepository;
import com.google.gson.Gson;

public class Main {

    public static void main(String[] args) {

        ProductRepository productRepository = new ProductRepository();
        Gson g = new Gson();
        System.out.println(g.toJson(productRepository.read(1)));

    }


}
