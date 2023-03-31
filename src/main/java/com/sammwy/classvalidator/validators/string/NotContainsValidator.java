package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.NotContains;
import com.sammwy.classvalidator.validators.StringValidator;

public class NotContainsValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return NotContains.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        NotContains annotation = field.getAnnotation(NotContains.class);
        return !value.contains(annotation.value());
    }
}
