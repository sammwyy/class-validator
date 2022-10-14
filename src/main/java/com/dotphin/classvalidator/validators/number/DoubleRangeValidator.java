package com.dotphin.classvalidator.validators.number;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.number.DoubleRange;
import com.dotphin.classvalidator.utils.NumberUtils;
import com.dotphin.classvalidator.validators.NumberValidator;

public class DoubleRangeValidator extends NumberValidator {
    @Override
    public Class<?> getAnnotation() {
        return DoubleRange.class;
    }

    @Override
    public boolean isValid(Field field, double value) {
        DoubleRange range = field.getAnnotation(DoubleRange.class);
        return NumberUtils.isRange(value, range.min(), range.max());
    }

    @Override
    public boolean isValid(Field field, float value) {
        DoubleRange range = field.getAnnotation(DoubleRange.class);
        return NumberUtils.isRange(value, range.min(), range.max());
    }

    @Override
    public boolean isValid(Field field, int value) {
        DoubleRange range = field.getAnnotation(DoubleRange.class);
        return NumberUtils.isRange(value, range.min(), range.max());
    }

    @Override
    public boolean isValid(Field field, long value) {
        DoubleRange range = field.getAnnotation(DoubleRange.class);
        return NumberUtils.isRange(value, range.min(), range.max());
    }
}
