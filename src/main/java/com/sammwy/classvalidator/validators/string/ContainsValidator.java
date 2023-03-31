package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.Contains;
import com.sammwy.classvalidator.validators.StringValidator;

public class ContainsValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return Contains.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        Contains annotation = field.getAnnotation(Contains.class);
        return value.contains(annotation.value());
    }
}
