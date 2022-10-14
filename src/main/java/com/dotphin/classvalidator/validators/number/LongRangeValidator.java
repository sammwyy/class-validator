package com.dotphin.classvalidator.validators.number;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.number.LongRange;
import com.dotphin.classvalidator.utils.NumberUtils;
import com.dotphin.classvalidator.validators.NumberValidator;

public class LongRangeValidator extends NumberValidator {
    @Override
    public Class<?> getAnnotation() {
        return LongRange.class;
    }

    @Override
    public boolean isValid(Field field, double value) {
        LongRange range = field.getAnnotation(LongRange.class);
        return NumberUtils.isRange(value, range.min(), range.max());
    }

    @Override
    public boolean isValid(Field field, float value) {
        LongRange range = field.getAnnotation(LongRange.class);
        return NumberUtils.isRange(value, range.min(), range.max());
    }

    @Override
    public boolean isValid(Field field, int value) {
        LongRange range = field.getAnnotation(LongRange.class);
        return NumberUtils.isRange(value, range.min(), range.max());
    }

    @Override
    public boolean isValid(Field field, long value) {
        LongRange range = field.getAnnotation(LongRange.class);
        return NumberUtils.isRange(value, range.min(), range.max());
    }
}
