package com.rohman.createanddestroy;

public class BestPracticeSingleton {
    private static final BestPracticeSingleton instanse = new BestPracticeSingleton();

    public static BestPracticeSingleton getInstance(){
        return instanse;
    }
}
