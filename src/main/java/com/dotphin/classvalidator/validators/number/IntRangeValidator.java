package com.dotphin.classvalidator.validators.number;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.number.IntRange;
import com.dotphin.classvalidator.utils.NumberUtils;
import com.dotphin.classvalidator.validators.NumberValidator;

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
