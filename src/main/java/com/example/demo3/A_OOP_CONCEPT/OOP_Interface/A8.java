package com.example.demo3.A_OOP_CONCEPT.OOP_Interface;

public class A8 extends Audi {

    public A8(boolean lightIsOn, int value) {
        super(lightIsOn, value);
    }

    @Override
    public void startEngine() {
        System.out.println("A8 engine was started");
    }

    @Override
    public String toString() {
        return "A8{ "
                + super.toString() +
                "}";
    }

    @Override
    public void doBeep() {
        System.out.println("A8 Beep made in GB: SAMSUNG");
    }
}
