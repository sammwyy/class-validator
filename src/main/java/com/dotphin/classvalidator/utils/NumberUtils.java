package com.dotphin.classvalidator.utils;

public class NumberUtils {
    public static boolean isDivisibleBy(double value, float divisor) {
        return value % divisor == 0;
    }

    public static boolean isDivisibleBy(float value, float divisor) {
        return value % divisor == 0;
    }

    public static boolean isDivisibleBy(int value, float divisor) {
        return value % divisor == 0;
    }

    public static boolean isDivisibleBy(long value, float divisor) {
        return value % divisor == 0;
    }
}
