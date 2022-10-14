package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsAlphanumeric;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

public class IsAlphanumericValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsAlphanumeric.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isAlphanumeric(value);
    }
}
