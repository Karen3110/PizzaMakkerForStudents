package com.example.demo3.A_OOP_CONCEPT.OOP_Interface;

public class GClass extends Mercedes  {

    public GClass(boolean lightIsOn, int value) {
        super(lightIsOn, value);
    }

    @Override
    public void startEngine() {
        System.out.println("G-class engine was started");
    }

    @Override
    public String toString() {
        return "GClass{ "
                + super.toString() +
                "}";
    }

//    @Override
//    public void doBeep() {
//        System.out.println("G-class Beep made in Germany: BOSCH");
//    }
}
