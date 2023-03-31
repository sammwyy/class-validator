package com.sammwy.classvalidator.utils;

public class ArrayUtils {
    public static boolean arrayContains(Object[] array, Object value) {
        for (Object item : array) {
            if (item.equals(value)) {
                return true;
            }
        }

        return false;
    }

    public static boolean isLength(Object[] array, int min, int max) {
        return array.length >= min && array.length <= max;
    }
}
