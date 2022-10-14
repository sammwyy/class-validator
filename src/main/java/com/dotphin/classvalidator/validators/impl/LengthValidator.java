package com.dotphin.classvalidator.validators.impl;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.annotations.Length;
import com.dotphin.classvalidator.validators.Validator;

public class LengthValidator implements Validator {
    @Override
    public Class<?> getAnnotation() {
        return Length.class;
    }

    @Override
    public boolean isValid(Field field, Object value) {
        Length annotation = field.getAnnotation(Length.class);
        int length = 0;

        if (value == null) {
            return false;
        }

        if (value instanceof String) {
            length = ((String) value).length();
        } else if (value instanceof Object[]) {
            length = ((Object[]) value).length;
        }

        return length <= annotation.max() && length >= annotation.min();
    }
}
