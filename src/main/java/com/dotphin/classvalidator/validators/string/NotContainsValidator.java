package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.NotContains;
import com.dotphin.classvalidator.validators.StringValidator;

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
