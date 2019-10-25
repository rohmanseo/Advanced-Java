package com.rohman.createanddestroy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NoConstructor noConstructor = new NoConstructor();
        Singleton singleton = Singleton.getInstance();
    }
}
