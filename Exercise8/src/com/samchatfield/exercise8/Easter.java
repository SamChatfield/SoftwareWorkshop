package com.samchatfield.exercise8;

import java.util.Date;

/**
 * Created by Sam on 17/11/2015.
 */
public class Easter {

    private int day, month, year;
    private Date easter;

    /**
     * Calculate the date on which easter falls in the given year
     *
     * @param year year
     */
    public Easter(int year) {
        this.year = year;
        calcEaster(year);
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }

    /**
     * Use the Anonymous Gregorian Algorithm to calculate the day and month of easter given the year
     *
     * @param y year
     */
    public void calcEaster(int y) {
        int a = y % 19;
        int b = (int) Math.floor(y / 100);
        int c = y % 100;
        int d = (int) Math.floor(b / 4);
        int e = b % 4;
        int f = (int) Math.floor((b + 8) / 25);
        int g = (int) Math.floor((b - f + 1) / 3);
        int h = (19 * a + b - d - g + 15) % 30;
        int i = (int) Math.floor(c / 4);
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (int) Math.floor((a + 11 * h + 22 * l) / 451);
        month = (int) Math.floor((h + l - 7 * m + 114) / 31);
        day = ((h + l - 7 * m + 114) % 31) + 1;
    }


    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
        calcEaster(year);
    }

}
