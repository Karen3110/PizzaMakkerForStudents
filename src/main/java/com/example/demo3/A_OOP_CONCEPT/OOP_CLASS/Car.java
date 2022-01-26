package com.example.demo3.A_OOP_CONCEPT.OOP_CLASS;

public class Car {
    public int maxSpeed;
    protected String model;
    int year;
    private boolean light;

    public Car() {
//        System.out.println("car constructor");
    }

    public Car(int maxSpeed, String model, int year, boolean light) {
        this.maxSpeed = maxSpeed;
        this.model = model;
        this.year = year;
        this.light = light;
    }

    public static void saySomething() {
        System.out.println("something I said: Car");
    }

    public void start() {
        System.out.println("xryu xryu xryu: engine is started");
    }

    protected void turnLamp(boolean onOff) {
        System.out.println("lamp is turned:" + onOff);
        light = onOff;
    }

    public void f() {
        System.out.println("car");
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", maxSpeed=" + maxSpeed +
                ", model='" + model + '\'' +
                ", light=" + light +
                '}';
    }
}
