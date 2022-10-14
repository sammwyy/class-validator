package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsRGB;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

public class IsRGBValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsRGB.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isRGB(value);
    }
}
