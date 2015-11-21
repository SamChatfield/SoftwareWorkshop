package com.samchatfield.exercise8Bonus1;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * Main logic class including the algorithmic calculation of the day of the week given a date
 *
 * Created by Sam on 18/11/2015.
 */
public class DayWeek {

    private int day, month, year, dayMax;
    private String dayOfWeek;
    private double julianDay;

    /**
     * Initialise variables and calculate day from starting values
     *
     * @param day   day
     * @param month month
     * @param year  year
     */
    public DayWeek(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.dayMax = calcDayMax(month);
        updateValues(day, month, year);
    }

    /**
     * Update the day of the week and the julian day
     *
     * @param day   day
     * @param month month
     * @param year  year
     */
    public void updateValues(int day, int month, int year) {
        dayOfWeek = calcGregorian(day, month, year);
        julianDay = calcJulianDay(day, month, year);
    }

    /**
     * Use Zeller's modified algorithm for positive numerator values for the Gregorian calendar on a given date
     * @param day day
     * @param month month
     * @param year year
     * @return h, a value representing the day as per Zeller's algorithm (0 = Saturday, 1 = Sunday ... 6 = Friday) which must be converted to conventional values Monday-Sunday used by java.time.DayOfWeek
     */
    public String calcGregorian(int day, int month, int year) {
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
     * Calculate current Julian based on Gregorian date and formula given on wikipedia page for 'Julian Day'
     *
     * @param day   day
     * @param month month
     * @param year  year
     * @return julian day
     */
    public double calcJulianDay(int day, int month, int year) {
        double a = Math.floor((14 - month) / 12);
        double y = year + 4800 - a;
        double m = month + 12 * a - 3;

        double JDN = day +
                Math.floor((153 * m + 2) / 5) +
                365 * y +
                Math.floor(y / 4) -
                Math.floor(y / 100) +
                Math.floor(y / 400) -
                32045;
        return JDN;
    }

    /**
     * Takes an h value returned from Zeller's algorithm and converts to the standard day numbering as per Zeller's algorithm value 'h' and java.time.DayOfWeek's day numbering
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

    /**
     * Calculate the number of days for a given month
     * @param month month
     * @return number of days in that month
     */
    public int calcDayMax(int month) {
        return (month == 2 && !isLeapYear(year)) ? 28 : Month.of(month).maxLength();
    }

    /**
     * Determine if given year is a leap year to be used to control the number of days in February
     *
     * @param y year
     * @return if it's a leap year return true else false
     */
    public boolean isLeapYear(int y) {
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }

    /**
     * Return day
     * @return day
     */
    public int getDay() {
        return day;
    }

    /**
     * Return string name of the day of the week
     * @return day of the week
     */
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Return month
     * @return month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Return year
     * @return year
     */
    public int getYear() {
        return year;
    }

    /**
     * Return maximum number of days in the current month
     * @return number of days
     */
    public int getDayMax() {
        return dayMax;
    }

    /**
     * Return the julian day of the given Gregorian date
     *
     * @return julian day
     */
    public double getJulianDay() {
        return julianDay;
    }

    /**
     * Change day value and recalculate the day of the week
     * @param day new day
     */
    public void setDay(int day) {
        this.day = day;
        updateValues(day, month, year);
    }

    /**
     * Change month value, recalculate the day of the week and recalculate the maxiumum number of days in the current month for this new month
     * @param month new month
     */
    public void setMonth(int month) {
        this.month = month;
        updateValues(day, month, year);
        dayMax = calcDayMax(month);
    }

    /**
     * Change year value and recalculate the day of the week
     * @param year new year
     */
    public void setYear(int year) {
        this.year = year;
        updateValues(day, month, year);
        if (month == 2) {
            dayMax = calcDayMax(month);
        }
    }

}
