package com.sammwy.classvalidator.validators.number;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.number.IntRange;
import com.sammwy.classvalidator.utils.NumberUtils;
import com.sammwy.classvalidator.validators.NumberValidator;

public class IntRangeValidator extends NumberValidator {
    @Override
    public Class<?> getAnnotation() {
        return IntRange.class;
    }

    @Override
    public boolean isValid(Field field, double value) {
        IntRange range = field.getAnnotation(IntRange.class);
        return NumberUtils.isRange(value, range.min(), range.max());
    }

    @Override
    public boolean isValid(Field field, float value) {
        IntRange range = field.getAnnotation(IntRange.class);
        return NumberUtils.isRange(value, range.min(), range.max());
    }

    @Override
    public boolean isValid(Field field, int value) {
        IntRange range = field.getAnnotation(IntRange.class);
        return NumberUtils.isRange(value, range.min(), range.max());
    }

    @Override
    public boolean isValid(Field field, long value) {
        IntRange range = field.getAnnotation(IntRange.class);
        return NumberUtils.isRange(value, range.min(), range.max());
    }
}
