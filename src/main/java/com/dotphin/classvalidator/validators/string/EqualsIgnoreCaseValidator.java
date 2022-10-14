package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.EqualsIgnoreCase;
import com.dotphin.classvalidator.validators.StringValidator;

public class EqualsIgnoreCaseValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return EqualsIgnoreCase.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        EqualsIgnoreCase annotation = field.getAnnotation(EqualsIgnoreCase.class);
        return value.equalsIgnoreCase(annotation.value());
    }
}
