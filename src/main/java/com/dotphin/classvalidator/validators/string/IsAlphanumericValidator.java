package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsAlphanumeric;

public class IsAlphanumericValidator extends RegexValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsAlphanumeric.class;
    }

    @Override
    public String getRegex(Field field) {
        return "^[a-zA-Z0-9]*$";
    }
}
