package org.example;

public class LeapYear {
    public static void main(String[] args) {
        int year = 1998;//Declaring var year and initializing the value
        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))//checks if the given year is divisible by 400 & 4
        //and given year is not divisible by 100
        {
            System.out.println(year + "is a leap year");
        } else {
            System.out.println(year + "is not a leap year");
        }
    }
}