package com.rohman.usingmethodscommon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        People people = new People();
        Scanner scanner = new Scanner(System.in);
        checkClass(people);
        checkClass(scanner);
    }

    static void checkClass(Object obj){
        if (obj.getClass() == People.class){
            System.out.println("Coorect");
        }else {
            System.out.println("Not Corrent");
        }
    }
}
