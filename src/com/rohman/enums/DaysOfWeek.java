package com.rohman.enums;

public enum DaysOfWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    static boolean isWeekend(DaysOfWeek day){
        if ( (day == SATURDAY) || (day == SUNDAY)) return true;
        else return false;
    }
}

