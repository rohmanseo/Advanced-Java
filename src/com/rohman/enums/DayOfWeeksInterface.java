package com.rohman.enums;

public enum DayOfWeeksInterface implements DayOfWeek {

    MONDAY() {
        @Override
        public boolean isWeekend () {
            return false;
        }
    },

    TUESDAY() {
        @Override
        public boolean isWeekend () {
            return false;
        }
    },

    WEDNESDAY() {
        @Override
        public boolean isWeekend () {
            return false;
        }
    },

    THURSDAY() {
        @Override
        public boolean isWeekend () {
            return false;
        }
    },

    FRIDAY() {
        @Override
        public boolean isWeekend () {
            return false;
        }
    },

    SATURDAY() {
        @Override
        public boolean isWeekend () {
            return true;
        }
    },

    SUNDAY() {
        @Override
        public boolean isWeekend () {
            return true;
        }
    }


}
