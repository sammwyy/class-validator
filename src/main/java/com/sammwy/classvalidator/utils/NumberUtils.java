package com.sammwy.classvalidator.utils;

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

    public static boolean isRange(double value, double min, double max) {
        return value >= min && value <= max;
    }

    public static boolean isRange(int value, double min, double max) {
        return value >= min && value <= max;
    }

    public static boolean isRange(float value, double min, double max) {
        return value >= min && value <= max;
    }

    public static boolean isRange(long value, double min, double max) {
        return value >= min && value <= max;
    }

    public static boolean isRange(double value, float min, float max) {
        return value >= min && value <= max;
    }

    public static boolean isRange(int value, float min, float max) {
        return value >= min && value <= max;
    }

    public static boolean isRange(float value, float min, float max) {
        return value >= min && value <= max;
    }

    public static boolean isRange(long value, float min, float max) {
        return value >= min && value <= max;
    }

    public static boolean isRange(double value, int min, int max) {
        return value >= min && value <= max;
    }

    public static boolean isRange(int value, int min, int max) {
        return value >= min && value <= max;
    }

    public static boolean isRange(float value, int min, int max) {
        return value >= min && value <= max;
    }

    public static boolean isRange(long value, int min, int max) {
        return value >= min && value <= max;
    }

    public static boolean isRange(double value, long min, long max) {
        return value >= min && value <= max;
    }

    public static boolean isRange(int value, long min, long max) {
        return value >= min && value <= max;
    }

    public static boolean isRange(float value, long min, long max) {
        return value >= min && value <= max;
    }

    public static boolean isRange(long value, long min, long max) {
        return value >= min && value <= max;
    }
}
