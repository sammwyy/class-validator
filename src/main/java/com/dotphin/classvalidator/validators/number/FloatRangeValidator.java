package com.dotphin.classvalidator.validators.number;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.number.FloatRange;
import com.dotphin.classvalidator.utils.NumberUtils;
import com.dotphin.classvalidator.validators.NumberValidator;

public class FloatRangeValidator extends NumberValidator {
    @Override
    public Class<?> getAnnotation() {
        return FloatRange.class;
    }

    @Override
    public boolean isValid(Field field, double value) {
        FloatRange range = field.getAnnotation(FloatRange.class);
        return NumberUtils.isRange(value, range.min(), range.max());
    }

    @Override
    public boolean isValid(Field field, float value) {
        FloatRange range = field.getAnnotation(FloatRange.class);
        return NumberUtils.isRange(value, range.min(), range.max());
    }

    @Override
    public boolean isValid(Field field, int value) {
        FloatRange range = field.getAnnotation(FloatRange.class);
        return NumberUtils.isRange(value, range.min(), range.max());
    }

    @Override
    public boolean isValid(Field field, long value) {
        FloatRange range = field.getAnnotation(FloatRange.class);
        return NumberUtils.isRange(value, range.min(), range.max());
    }
}
