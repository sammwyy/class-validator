package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsAlpha;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

public class IsAlphaValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsAlpha.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isAlpha(value);
    }
}
