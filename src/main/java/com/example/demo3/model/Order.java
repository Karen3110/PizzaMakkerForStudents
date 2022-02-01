package com.example.demo3.model;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private int id;

    private int table_id;

    private boolean in_process;

    private int productId;

    private int quantity;

    private float amount;
}
