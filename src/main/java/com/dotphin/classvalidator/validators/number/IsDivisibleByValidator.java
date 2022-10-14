package com.dotphin.classvalidator.validators.number;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.number.IsDivisibleBy;
import com.dotphin.classvalidator.utils.NumberUtils;
import com.dotphin.classvalidator.validators.NumberValidator;

public class IsDivisibleByValidator extends NumberValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsDivisibleBy.class;
    }

    @Override
    public boolean isValid(Field field, double value) {
        IsDivisibleBy by = field.getAnnotation(IsDivisibleBy.class);
        return NumberUtils.isDivisibleBy(value, by.value());
    }

    @Override
    public boolean isValid(Field field, float value) {
        IsDivisibleBy by = field.getAnnotation(IsDivisibleBy.class);
        return NumberUtils.isDivisibleBy(value, by.value());
    }

    @Override
    public boolean isValid(Field field, int value) {
        IsDivisibleBy by = field.getAnnotation(IsDivisibleBy.class);
        return NumberUtils.isDivisibleBy(value, by.value());
    }

    @Override
    public boolean isValid(Field field, long value) {
        IsDivisibleBy by = field.getAnnotation(IsDivisibleBy.class);
        return NumberUtils.isDivisibleBy(value, by.value());
    }
}
