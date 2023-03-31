package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.Equals;
import com.sammwy.classvalidator.validators.StringValidator;

public class EqualsValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return Equals.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        Equals annotation = field.getAnnotation(Equals.class);
        return value.equals(annotation.value());
    }
}
