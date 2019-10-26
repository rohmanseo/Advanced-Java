package com.rohman.generics;

public class TestGenericClass implements GenericInterface<String, Integer> {

    @Override
    public void performAction(String action, Integer action2) {
        System.out.println("Hello " + action + " your number is " + action2);
    }
}
