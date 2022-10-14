package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.Equals;
import com.dotphin.classvalidator.validators.StringValidator;

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
