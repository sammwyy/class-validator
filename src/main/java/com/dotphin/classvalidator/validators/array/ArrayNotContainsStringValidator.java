package com.dotphin.classvalidator.validators.array;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.array.ArrayNotContainsString;
import com.dotphin.classvalidator.utils.ArrayUtils;
import com.dotphin.classvalidator.validators.ArrayValidator;

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
