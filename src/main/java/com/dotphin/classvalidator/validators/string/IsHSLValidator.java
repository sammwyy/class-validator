package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsHSL;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

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
