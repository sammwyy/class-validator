package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsEmail;
import com.dotphin.classvalidator.validators.Validator;

public class IsEmailValidator implements Validator {
    @Override
    public Class<?> getAnnotation() {
        return IsEmail.class;
    }

    @Override
    public boolean isValid(Field field, Object value) {
        if (value != null && value instanceof String) {
            String str = (String) value;
            return str.contains("@");
        }

        return false;
    }
}
