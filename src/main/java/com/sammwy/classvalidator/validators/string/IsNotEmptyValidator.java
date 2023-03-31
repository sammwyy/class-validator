package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsNotEmpty;
import com.sammwy.classvalidator.validators.StringValidator;

public class IsNotEmptyValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsNotEmpty.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        IsNotEmpty notEmpty = field.getAnnotation(IsNotEmpty.class);
        return notEmpty.trim() ? !value.trim().isEmpty() : !value.isEmpty();
    }
}
