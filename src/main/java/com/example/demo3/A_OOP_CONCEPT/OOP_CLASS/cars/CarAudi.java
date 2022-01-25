package com.example.demo3.A_OOP_CONCEPT.OOP_CLASS.cars;

import com.example.demo3.A_OOP_CONCEPT.OOP_CLASS.Car;

public class CarAudi extends Car {

    public CarAudi() {
//        System.out.println("created Car: audi");
    }

    public CarAudi(int maxSpeed, String model, int year, boolean light, boolean fourMatic) {
        super(maxSpeed, model, year, light);
    }


    @Override
    public void f() {
        System.out.println("Audi");
    }

    @Override
    public String toString() {

        return "CarAudi{" +
                super.toString() +
                '}';

    }


}
