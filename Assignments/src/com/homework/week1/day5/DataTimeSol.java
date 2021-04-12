package com.homework.week1.day5;

import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;

public class DataTimeSol {

    public static void main(String[] args) {
        // Which Class would you store your birthday in days, seconds
        // LocalDateTime
        LocalDateTime myBirthday = LocalDateTime.parse("2012-02-20T06:30:00");

        // Given a random date, find out date of previous thursday
        DayOfWeek day = LocalDate.parse("2012-06-12").getDayOfWeek();
        // See Method


        // Difference between ZoneId and ZoneOffset
        /**
         * ZoneId refers to a time-zone identifier that provides rules for converting
         * between an Instant and a local date time
         *
         * ZoneOffset describes a time zone offset from UTC/Greenwich by number of hours/minutes
         */
        LocalTime indiaTime = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        LocalTime indiaTimeOffset = LocalTime.now(ZoneOffset.of("Asia/Kolkata"));


        // Convert Instant to a ZonedDateTime

        Instant instant = Instant.now();
        ZonedDateTime usTime = instant.atZone(ZoneId.of("America/New_York"));
        usTime.plusDays(0).toInstant();

        // For an given year, print length of each month in hat year
        for(int i = 1; i <= 12; i++) {
            YearMonth yearMonthObject = YearMonth.of(1999, 1);
            System.out.println("1999 Month: " + i + "Days: " + yearMonthObject.lengthOfMonth());
        }

    }




    public static LocalDateTime prevThursday(LocalDateTime dt) {
        return dt.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
    }

    public static ArrayList<Integer> monthLength(int year) {
        ArrayList<Integer> lengths = new ArrayList<>();
        for(int i = 1; i <= 12; i++) {
            YearMonth yearMonthObject = YearMonth.of(year, i);
            lengths.add(yearMonthObject.lengthOfMonth());
        }
        return lengths;
    }

    public static ArrayList<String> findMonday(int month) {
        ArrayList<LocalDate> myMondays = new ArrayList<>();
        LocalDate aMonday = LocalDate.now().withMonth(month).with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        ArrayList<String> myMondaysInString = new ArrayList<>();


        while(aMonday.isBefore(LocalDate.now().withMonth(month + 1))) {
            myMondays.add(aMonday);
            myMondaysInString.add(aMonday.toString());
            aMonday = aMonday.plusWeeks(1);
        }

        return myMondaysInString;
    }

    // Test if Date is on Friday the 13th
    public static Boolean isUnlucky(LocalDateTime in) {
        if (in.getDayOfMonth() == 13 && in.getDayOfWeek() == DayOfWeek.FRIDAY) {
            return true;
        }
        return false;
    }



}
