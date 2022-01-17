package com.example.demo3.A_OOP_CONCEPT.OOP_CLASS.cars;

import com.example.demo3.A_OOP_CONCEPT.OOP_CLASS.Car;

public class CarMercedes extends Car {

    public CarMercedes() {
//        System.out.println("created Car: mercedes");
    }

    public CarMercedes(int maxSpeed, String model, int year, boolean light) {
        super(maxSpeed, model, year, light);
    }

    @Override
    public void f() {
        System.out.println("Mercedes");
    }

    @Override
    public String toString() {

        return "CarMercedes{" +
                super.toString() +
                '}';

    }


}
