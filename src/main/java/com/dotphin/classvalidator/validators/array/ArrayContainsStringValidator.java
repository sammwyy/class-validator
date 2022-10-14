package com.dotphin.classvalidator.validators.array;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.array.ArrayContainsString;
import com.dotphin.classvalidator.utils.ArrayUtils;
import com.dotphin.classvalidator.validators.ArrayValidator;

public class ArrayContainsStringValidator extends ArrayValidator {
    @Override
    public Class<?> getAnnotation() {
        return ArrayContainsString.class;
    }

    @Override
    public boolean isValid(Field field, Object[] value) {
        ArrayContainsString arrayContains = field.getAnnotation(ArrayContainsString.class);
        return ArrayUtils.arrayContains(value, arrayContains.value());
    }
}
