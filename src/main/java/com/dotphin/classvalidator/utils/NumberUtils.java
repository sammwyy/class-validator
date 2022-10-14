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

    public static boolean isNegative(double value) {
        return value < 0;
    }

    public static boolean isNegative(float value) {
        return value < 0;
    }

    public static boolean isNegative(int value) {
        return value < 0;
    }

    public static boolean isNegative(long value) {
        return value < 0;
    }

    public static boolean isPositive(double value) {
        return value > 0;
    }

    public static boolean isPositive(float value) {
        return value > 0;
    }

    public static boolean isPositive(int value) {
        return value > 0;
    }

    public static boolean isPositive(long value) {
        return value > 0;
    }
}
