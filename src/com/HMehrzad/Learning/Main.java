package com.HMehrzad.Learning;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double miles = SpeedConverter.toMilePerHour(10.5);
        System.out.println("Miles = " + miles);
        SpeedConverter.printConversion(10.5);
    }
}