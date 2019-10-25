package com.rohman.createanddestroy;

public class Singleton {
    private static Singleton singleton = null;

    public static Singleton getInstance() {
        if (singleton == null){
            singleton = new Singleton();
        }

        return singleton;
    }

}
