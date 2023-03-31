package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsBase32;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

public class IsBase32Validator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsBase32.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isBase32(value);
    }
}
