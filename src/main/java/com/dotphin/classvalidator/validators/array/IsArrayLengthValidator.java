package com.dotphin.classvalidator.validators.array;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.array.IsArrayLength;
import com.dotphin.classvalidator.utils.ArrayUtils;
import com.dotphin.classvalidator.validators.ArrayValidator;

public class IsArrayLengthValidator extends ArrayValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsArrayLength.class;
    }

    @Override
    public boolean isValid(Field field, Object[] value) {
        IsArrayLength isArrayLength = field.getAnnotation(IsArrayLength.class);
        return ArrayUtils.isLength(value, isArrayLength.min(), isArrayLength.max());
    }
}
