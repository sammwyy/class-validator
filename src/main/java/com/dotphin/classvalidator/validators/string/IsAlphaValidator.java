package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsAlpha;

public class IsAlphaValidator extends RegexValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsAlpha.class;
    }

    @Override
    public String getRegex(Field field) {
        return "^[a-zA-Z]*$";
    }
}
