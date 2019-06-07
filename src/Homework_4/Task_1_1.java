package Homework_4;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Task_1_1 {

    public enum DaysOfWeek {

        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY ;
    }

    public static void main(String[] args) {

        Instant instant = Instant.now();
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        ZonedDateTime zdt = ZonedDateTime.ofInstant(instant, zoneId);
        DayOfWeek day = DayOfWeek.from(zdt);


        if (day == DayOfWeek.MONDAY) {
            System.out.println("Today is: " + DaysOfWeek.MONDAY);
        }

        if (day == DayOfWeek.TUESDAY) {
            System.out.println("Today is: " + DaysOfWeek.TUESDAY);
        }

        if (day == DayOfWeek.WEDNESDAY) {
            System.out.println("Today is: " + DaysOfWeek.WEDNESDAY);
        }

        if (day == DayOfWeek.THURSDAY) {
            System.out.println("Today is: " + DaysOfWeek.THURSDAY);
        }

        if (day == DayOfWeek.FRIDAY) {
            System.out.println("Today is: " + DaysOfWeek.FRIDAY);
        }

        if (day == DayOfWeek.SATURDAY) {
            System.out.println("Today is: " + DaysOfWeek.SATURDAY);
        }

        if (day == DayOfWeek.SUNDAY) {
            System.out.println("Today is: " + DaysOfWeek.SUNDAY);
        }

    }
}