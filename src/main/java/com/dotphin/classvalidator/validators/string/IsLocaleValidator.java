package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsLocale;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

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
