package com.dotphin.classvalidator.validators.number;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.number.IsPositive;
import com.dotphin.classvalidator.utils.NumberUtils;
import com.dotphin.classvalidator.validators.NumberValidator;

public class IsPositiveValidator extends NumberValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsPositive.class;
    }

    @Override
    public boolean isValid(Field field, double value) {
        return NumberUtils.isPositive(value);
    }

    @Override
    public boolean isValid(Field field, float value) {
        return NumberUtils.isPositive(value);
    }

    @Override
    public boolean isValid(Field field, int value) {
        return NumberUtils.isPositive(value);
    }

    @Override
    public boolean isValid(Field field, long value) {
        return NumberUtils.isPositive(value);
    }
}
