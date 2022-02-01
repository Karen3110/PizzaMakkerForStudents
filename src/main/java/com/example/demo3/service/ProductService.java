package com.example.demo3.service;

import com.example.demo3.model.Product;
import com.example.demo3.model.dto.ProductDto;

import java.util.List;

public interface ProductService {


    ProductDto read(int id);

    List<ProductDto> readAll();

    List<ProductDto> readAllByProductType(int productTypeId);

    void create();


    ProductDto update(int id, ProductDto productDto);

    void delete(int id);

}
