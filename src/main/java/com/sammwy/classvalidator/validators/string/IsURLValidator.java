package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsURL;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

public class IsURLValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsURL.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isURL(value);
    }
}
