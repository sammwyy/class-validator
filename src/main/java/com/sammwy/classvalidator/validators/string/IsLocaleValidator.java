package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsLocale;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

public class IsLocaleValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsLocale.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isLocale(value);
    }
}
