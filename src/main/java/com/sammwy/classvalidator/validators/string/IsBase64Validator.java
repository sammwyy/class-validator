package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsBase64;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

public class IsBase64Validator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsBase64.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isBase64(value);
    }
}
