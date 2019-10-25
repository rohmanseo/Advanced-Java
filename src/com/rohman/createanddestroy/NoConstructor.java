package com.rohman.createanddestroy;

public class NoConstructor {

    static {
        System.out.println("Hello");
        System.out.println("Ahaa - its look like init keyword in kotlin");
    }

    NoConstructor(){
        System.out.println("You can also do like this");
    }

}
