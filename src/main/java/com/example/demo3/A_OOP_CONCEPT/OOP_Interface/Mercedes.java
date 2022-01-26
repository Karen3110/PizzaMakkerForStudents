package com.example.demo3.A_OOP_CONCEPT.OOP_Interface;

public class Mercedes implements Car, Beep {

    private final int value;
    private boolean lightIsOn;

    public Mercedes(boolean lightIsOn, int value) {
        this.lightIsOn = lightIsOn;
        this.value = value;
    }

    @Override
    public void startEngine() {
        System.out.println("Mercedes engine Started");
    }

    @Override
    public void turnLights(boolean isOn) {
        lightIsOn = isOn;

    }

    @Override
    public String toString() {
        return "Mercedes{" +
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
        System.out.println("default beep from mercedes");
    }
}
