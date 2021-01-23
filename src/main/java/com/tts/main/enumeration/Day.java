package com.tts.main.enumeration;

// enums are data structures to easily define and use constants
public enum Day {
      SUNDAY, MONDAY, TUESDAY,  WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    // Day day is similar to int x
    // "Day" is your type, in this case the enum
    // "day" is your variable name or reference
    public static void checkDay(Day day) {
        switch (day) {
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

}



