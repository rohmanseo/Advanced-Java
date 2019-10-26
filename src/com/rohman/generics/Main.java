package com.rohman.generics;

import com.rohman.generics.GenericClass;
import com.rohman.generics.TestGenericClass;

import java.io.InputStream;
import java.io.Serializable;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        TestGenericClass testGenericClass = new TestGenericClass();
        testGenericClass.performAction("Rohman",89162514);

        GenericClass genericClass = new GenericClass();
        genericClass.performAction("Rohman");

        System.out.println(calculate(1,2,3));

    }

    //Here is example of generic method declaration
    public static <A,B,C> String calculate(A a, B b, C c){
        return String.valueOf((Integer) a + (Integer) b + (Integer) c );
    }


}
