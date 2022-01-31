package com.example.demo3.service;

import com.example.demo3.model.Table;
import com.example.demo3.model.dto.ProductDto;

import java.util.List;

public interface ProductService {


    ProductDto read(int id);

    List<ProductDto> readAll();

    List<ProductDto> readAllByProductType(int productTypeId);

    void create();

    Table update(int id, Table table);

    void delete(int id);

}
