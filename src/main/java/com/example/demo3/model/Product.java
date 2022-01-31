package com.example.demo3.model;

import lombok.*;

import java.util.Currency;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    private int id;
    private int productTypeId;
    private String name;
    private float price;
    private String imagePath;
    private String currency;


}

