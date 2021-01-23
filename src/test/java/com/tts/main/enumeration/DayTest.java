package com.tts.main.enumeration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayTest {

    public static void checkDay(Day day){
        switch (day){
            case MONDAY:
                System.out.println("Monday's are bad");
                break;
            case FRIDAY:
                System.out.println("Friday's are better");
                break;
            case SATURDAY:
                System.out.println("Weekends are best");
                break;
            default:
                System.out.println("midweeks are so-so");
        }

    }

    @Test
    void test() {
        checkDay(Day.MONDAY);
        //Day.checkDay(Day.TUESDAY);
    }
}