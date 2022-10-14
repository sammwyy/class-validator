package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsUpperCase;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

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
