package com.example.demo3.model;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class Ingredient {
    private int id;
    private String name;
    private boolean editable;
    private int editStep;
    private int minBound;
    private int maxBound;
    private String measurement;
}
