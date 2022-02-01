package com.example.demo3.model;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor

public class Table {

    private int id;

    private int number;

    private int seats;

    private boolean busy;

}

