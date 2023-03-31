package com.sammwy.classvalidator.validators.number;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.number.IsNegative;
import com.sammwy.classvalidator.utils.NumberUtils;
import com.sammwy.classvalidator.validators.NumberValidator;

public class IsNegativeValidator extends NumberValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsNegative.class;
    }

    @Override
    public boolean isValid(Field field, double value) {
        return NumberUtils.isNegative(value);
    }

    @Override
    public boolean isValid(Field field, float value) {
        return NumberUtils.isNegative(value);
    }

    @Override
    public boolean isValid(Field field, int value) {
        return NumberUtils.isNegative(value);
    }

    @Override
    public boolean isValid(Field field, long value) {
        return NumberUtils.isNegative(value);
    }
}
