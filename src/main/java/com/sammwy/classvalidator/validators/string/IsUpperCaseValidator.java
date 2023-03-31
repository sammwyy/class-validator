package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsUpperCase;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

public class IsUpperCaseValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsUpperCase.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isUpperCase(value);
    }
}
