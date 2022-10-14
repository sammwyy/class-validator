package com.dotphin.classvalidator.validators.number;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.number.IsNegative;
import com.dotphin.classvalidator.utils.NumberUtils;
import com.dotphin.classvalidator.validators.NumberValidator;

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
