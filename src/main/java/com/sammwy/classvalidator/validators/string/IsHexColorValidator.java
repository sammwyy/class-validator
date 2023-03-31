package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsHexColor;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

public class IsHexColorValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsHexColor.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isHexColor(value);
    }
}
