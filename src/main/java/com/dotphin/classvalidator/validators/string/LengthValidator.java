package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.Length;
import com.dotphin.classvalidator.validators.Validator;

public class LengthValidator implements Validator {
    @Override
    public Class<?> getAnnotation() {
        return Length.class;
    }

    @Override
    public boolean isValid(Field field, Object value) {
        Length annotation = field.getAnnotation(Length.class);

        if (value != null && value instanceof String) {
            int length = ((String) value).length();
            return length <= annotation.max() && length >= annotation.min();
        }

        return true;
    }
}
