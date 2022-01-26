package com.example.demo3;

import com.example.demo3.repository.TableRepository;

public class Main {

    public static void main(String[] args) {
        TableRepository tableRepository = new TableRepository();

        System.out.println(tableRepository.readAll());

    }


}
