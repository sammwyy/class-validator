package com.sammwy.classvalidator.validators;

import java.lang.reflect.Field;

public abstract class NumberValidator implements Validator {
    public abstract boolean isValid(Field field, double value);

    public abstract boolean isValid(Field field, float value);

    public abstract boolean isValid(Field field, int value);

    public abstract boolean isValid(Field field, long value);

    public boolean isValid(Field field, Object value) {
        if (value != null && value instanceof Double) {
            return this.isValid(field, (double) value);
        }

        else if (value != null && value instanceof Float) {
            return this.isValid(field, (float) value);
        }

        else if (value != null && value instanceof Integer) {
            return this.isValid(field, (int) value);
        }

        else if (value != null && value instanceof Long) {
            return this.isValid(field, (long) value);
        }

        return true;
    }
}
