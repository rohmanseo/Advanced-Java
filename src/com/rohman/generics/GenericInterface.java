package com.rohman.generics;

//the generic interface is parameterized T, and Y. which could be used immediately by interface declaration :)
public interface GenericInterface<T, Y> {
    void performAction(final T action, final Y action2);
}
