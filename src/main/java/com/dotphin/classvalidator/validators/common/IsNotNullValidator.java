package com.dotphin.classvalidator.validators.common;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.common.IsNotNull;
import com.dotphin.classvalidator.validators.Validator;

public class IsNotNullValidator implements Validator {
    @Override
    public Class<?> getAnnotation() {
        return IsNotNull.class;
    }

    @Override
    public boolean isValid(Field field, Object value) {
        return value != null;
    }
}
