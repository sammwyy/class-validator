package com.sammwy.classvalidator.validators.common;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.common.IsNotNull;
import com.sammwy.classvalidator.validators.Validator;

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
