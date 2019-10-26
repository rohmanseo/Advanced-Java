package com.rohman.enums;

//Enums are specialized class and as such are extensible
//It means they can have fields, constructors and methods
//The only limitation is just the defalut no arguments constructor can't be declarated, and all constructors must be default or private

public enum DaysOfWeekField {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private final boolean isWeekend;

    private final boolean isWeekend(){
        return isWeekend;
    }

    DaysOfWeekField(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }
}
