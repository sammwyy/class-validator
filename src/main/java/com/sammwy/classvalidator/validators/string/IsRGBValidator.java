package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsRGB;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

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
