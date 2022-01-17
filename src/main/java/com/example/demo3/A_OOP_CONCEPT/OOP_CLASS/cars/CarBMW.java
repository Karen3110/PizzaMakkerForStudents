package com.example.demo3.A_OOP_CONCEPT.OOP_CLASS.cars;

import com.example.demo3.A_OOP_CONCEPT.OOP_CLASS.Car;

public class CarBMW extends Car {

    public CarBMW() {
//        System.out.println("created Car: BMW");
    }

    public CarBMW(int maxSpeed, String model, int year, boolean light) {
        super(maxSpeed, model, year, light);
    }

    @Override
    public  void f(){
        System.out.println("BMW");
    }

    @Override
    public String toString() {

        return "CarBMW{" +
                super.toString() +
                '}';

    }


}
