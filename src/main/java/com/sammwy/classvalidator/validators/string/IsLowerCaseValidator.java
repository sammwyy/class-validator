package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsLowerCase;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

public class IsLowerCaseValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsLowerCase.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isLowerCase(value);
    }
}
