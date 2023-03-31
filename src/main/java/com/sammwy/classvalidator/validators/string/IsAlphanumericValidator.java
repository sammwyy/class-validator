package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsAlphanumeric;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

public class IsAlphanumericValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsAlphanumeric.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isAlphanumeric(value);
    }
}
