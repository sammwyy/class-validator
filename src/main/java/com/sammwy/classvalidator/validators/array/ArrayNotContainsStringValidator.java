package com.sammwy.classvalidator.validators.array;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.array.ArrayNotContainsString;
import com.sammwy.classvalidator.utils.ArrayUtils;
import com.sammwy.classvalidator.validators.ArrayValidator;

public class ArrayNotContainsStringValidator extends ArrayValidator {
    @Override
    public Class<?> getAnnotation() {
        return ArrayNotContainsString.class;
    }

    @Override
    public boolean isValid(Field field, Object[] value) {
        ArrayNotContainsString arrayContains = field.getAnnotation(ArrayNotContainsString.class);
        return !ArrayUtils.arrayContains(value, arrayContains.value());
    }
}
