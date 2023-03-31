package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsHSL;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

public class IsHSLValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsHSL.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isHSL(value);
    }
}
