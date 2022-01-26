package com.example.demo3.model;

import lombok.*;

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
    private String img;
    private int quantity;
    //private List<Integer> ingredientsIdList;

}
