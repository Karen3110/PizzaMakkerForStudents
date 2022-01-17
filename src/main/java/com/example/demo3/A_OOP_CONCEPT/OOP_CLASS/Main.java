package com.example.demo3.A_OOP_CONCEPT.OOP_CLASS;

import com.example.demo3.A_OOP_CONCEPT.OOP_CLASS.cars.CarAudi;
import com.example.demo3.A_OOP_CONCEPT.OOP_CLASS.cars.CarBMW;
import com.example.demo3.A_OOP_CONCEPT.OOP_CLASS.cars.CarMercedes;
import com.example.demo3.A_OOP_CONCEPT.OOP_CLASS.cars.GClass;

public class Main {
    public static void main(String[] args) {


        Car c = new CarMercedes();
        c.f();

        c = new CarBMW();
        c.f();

        c = new CarAudi();
        c.f();

        c = new CarMercedes();
        c.f();


        c = new GClass(2020);
        c.f();

    }
}
