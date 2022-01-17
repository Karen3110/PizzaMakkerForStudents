package com.example.demo3.A_OOP_CONCEPT.OOP_Interface;

public class Main {
    public static void main(String[] args) {
        Mercedes gClass = new GClass(true,34);

        System.out.println(gClass);

        gClass.startEngine();
       gClass.doBeep();


        Audi a8 = new A8(true,76543);

        System.out.println(a8);
        a8.startEngine();
        a8.doBeep();



    }
}
