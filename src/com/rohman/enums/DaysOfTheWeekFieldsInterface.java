package com.rohman.enums;

public enum DaysOfTheWeekFieldsInterface implements DayOfWeek {

    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    DaysOfTheWeekFieldsInterface(final boolean isWeekend){

    }

    @Override
    public boolean isWeekend() {
        return false;
    }
}
