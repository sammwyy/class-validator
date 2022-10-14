package com.dotphin.classvalidator.utils;

public class StringUtils {
    public static boolean isAlpha(String value) {
        return value.matches("^[a-zA-Z]*$");
    }

    public static boolean isAlphanumeric(String value) {
        return value.matches("^[a-zA-Z0-9]*$");
    }

    public static boolean isBIC(String value) {
        return value.matches("^[A-Z]{6}[A-Z0-9]{2}([A-Z0-9]{3})?$");
    }

    public static boolean isEmail(String value) {
        return value.matches("^(.+)@(.+)$");
    }

    public static boolean isLength(String value, int min, int max) {
        int length = value.length();
        return length <= max && length >= min;
    }

    public static boolean isSwift(String value) {
        return isBIC(value);
    }
}
