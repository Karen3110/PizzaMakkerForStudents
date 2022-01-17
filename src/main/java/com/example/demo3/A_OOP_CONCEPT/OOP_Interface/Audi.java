package com.example.demo3.A_OOP_CONCEPT.OOP_Interface;

public  class Audi implements Car, Beep{

    private boolean lightIsOn ;
    private int value;

    public Audi(boolean lightIsOn, int value) {
        this.lightIsOn = lightIsOn;
        this.value = value;
    }

    @Override
    public void startEngine() {
        System.out.println("Audi engine Started");
    }

    @Override
    public void turnLights(boolean isOn) {
        lightIsOn = isOn;

    }

    @Override
    public String toString() {
        return "Audi{" +
                "lightIsOn=" + lightIsOn +
                ", value=" + value +
                '}';
    }

    public boolean isLightIsOn() {
        return lightIsOn;
    }

    public void setLightIsOn(boolean lightIsOn) {
        this.lightIsOn = lightIsOn;
    }

    @Override
    public void doBeep() {
        System.out.println("default beep System from Audi");
    }
}
