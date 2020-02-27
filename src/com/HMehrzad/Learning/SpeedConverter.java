package com.HMehrzad.Learning;

public class SpeedConverter {
    public static long toMilePerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometrsPerHour) {
        if (kilometrsPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milePerHour = toMilePerHour(kilometrsPerHour);
            System.out.println(kilometrsPerHour + " km/h= " + milePerHour + " mi/h");
        }
    }
}