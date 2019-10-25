package com.rohman.createanddestroy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NoConstructor noConstructor = new NoConstructor();
        Singleton singleton = Singleton.getInstance();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Waiting thread");
    }

}
