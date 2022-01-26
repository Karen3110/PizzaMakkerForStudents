package com.example.demo3.repository;

import com.example.demo3.model.ProductType;

import java.util.LinkedList;
import java.util.List;

public class ProductTypeRepository {

    // mocked data is generated

    public ProductType read(int id) {
        return new ProductType(id, "random Name for test");
    }

    public List<ProductType> readAll() {
        List<ProductType> objects = new LinkedList<>();
        objects.add(new ProductType(1, "xorovac"));
        objects.add(new ProductType(2, "alcohol"));
        objects.add(new ProductType(3, "qaxcr"));
        objects.add(new ProductType(4, "sare"));

        return objects;
    }

    public void create(ProductType productType) {

    }

    public ProductType update(int id, ProductType productType) {
        return null;
    }

    public void delete(int id) {

    }

    public ProductType read(String name) {
        return new ProductType(23, name);
    }
}
