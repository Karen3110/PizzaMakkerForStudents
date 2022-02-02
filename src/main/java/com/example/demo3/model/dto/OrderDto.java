package com.example.demo3.model.dto;

import com.example.demo3.model.Product;
import lombok.*;

import java.util.List;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {

    private int tableId;

    private boolean inProcess;

    private int quantity;

    private float amount;

    private List<Product> products;
}
