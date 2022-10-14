package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsBase64;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

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
