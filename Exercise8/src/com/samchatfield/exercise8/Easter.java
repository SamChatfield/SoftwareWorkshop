package com.samchatfield.exercise8;

/**
 * Class containing the logic of the Easter calculator
 *
 * Created by Sam on 17/11/2015.
 */
public class Easter {

    private int day, month, year;

    /**
     * Calculate the date on which easter falls in the given year
     *
     * @param year year
     */
    public Easter(int year) {
        this.year = year;
        calcEaster(year);
    }

    /**
     * A temporary method created to test in the command line for question 1
     *
     * @return string representation of the date calculated
     */
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

    /**
     * Return the day
     *
     * @return day
     */
    public int getDay() {
        return day;
    }

    /**
     * Return an integer representation of the month
     * @return month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Return the year
     * @return year
     */
    public int getYear() {
        return year;
    }

    /**
     * Set the current year and call the calculation to update the day and month
     * @param year new year to calculate the date of easter for
     */
    public void setYear(int year) {
        this.year = year;
        calcEaster(year);
    }

}
