package com.example.demo3.service.impl;

import com.example.demo3.model.Ingredient;
import com.example.demo3.model.Table;
import com.example.demo3.model.dto.ProductDto;
import com.example.demo3.repository.ProductRepository;
import com.example.demo3.service.ProductService;

import java.util.LinkedList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository = new ProductRepository();


    @Override
    public ProductDto read(int id) {
        ProductDto productDto = new ProductDto();
        List<ProductDto> fromDb = productRepository.read(id);

        productDto.setId(fromDb.get(0).getId());
        productDto.setProductTypeId(fromDb.get(0).getProductTypeId());
        productDto.setPrice(fromDb.get(0).getPrice());
        productDto.setName(fromDb.get(0).getName());
        productDto.setImagePath(fromDb.get(0).getImagePath());
        productDto.setCurrency(fromDb.get(0).getCurrency());
        productDto.setIngredients(new LinkedList<>());

        fromDb.forEach(item -> {
            Ingredient ingredient = new Ingredient(item.getIngredientId(), item.getIngredientName());
            productDto.getIngredients().add(ingredient);
        });

        return productDto;
    }

    @Override
    public List<ProductDto> readAll() {
        return null;
    }

    @Override
    public List<ProductDto> readAllByProductType(int productTypeId) {

        return null;
    }

    @Override
    public void create() {

    }


    @Override
    public Table update(int id, Table table) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
