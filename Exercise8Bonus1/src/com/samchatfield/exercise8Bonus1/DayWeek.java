package com.samchatfield.exercise8Bonus1;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * Created by Sam on 18/11/2015.
 */
public class DayWeek {

    private int day, month, year, dayMax;
    private String dayOfWeek;

    public DayWeek(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.dayMax = calcDayMax(month);
        dayOfWeek = calcGregorian(day, month, year);
    }

    // TODO write javadoc for algorithm
    // Use Zeller's modified algorithm for computers for the Gregorian calendar (taken from wikipedia.org)
    private String calcGregorian(int day, int month, int year) {
        int q = day;
        int y = year - 1;
        int m;

        if (month == 1) {
            m = 13;
        } else if (month == 2) {
            m = 14;
        } else {
            m = month;
            y = year;
        }

        int h = (
                q +
                        (int) Math.floor((26 * (m + 1)) / 10) +
                        y +
                        (int) Math.floor(y / 4) +
                        6 * (int) Math.floor(y / 100) +
                        (int) Math.floor(y / 400)
        ) % 7;
        return dayToString(hToDay(h));
    }

    /**
     * Takes an h returned from Zeller's algorithm and converts to the standard day numbering as per Zeller's algorithm value 'h' and java.time.DayOfWeek's day numbering
     *
     * @param h Zeller's h day number
     * @return DayOfWeek day number
     */
    public int hToDay(int h) {
        if (h == 0) {
            return 6;
        } else if (h == 1) {
            return 7;
        } else {
            return h - 1;
        }
    }

    /**
     * Takes a standard day number and returns the name of the day in English
     *
     * @param day DayOfWeek day number
     * @return string name of the day in English
     */
    public String dayToString(int day) {
        return DayOfWeek.of(day).getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }

    public int calcDayMax(int month) {
        return Month.of(month).maxLength();
    }

    public int getDay() {
        return day;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getDayMax() {
        return dayMax;
    }

    public void setDay(int day) {
        this.day = day;
        dayOfWeek = calcGregorian(day, month, year);
    }

    public void setMonth(int month) {
        this.month = month;
        dayOfWeek = calcGregorian(day, month, year);
        dayMax = calcDayMax(month);
    }

    public void setYear(int year) {
        this.year = year;
        dayOfWeek = calcGregorian(day, month, year);
    }

}
