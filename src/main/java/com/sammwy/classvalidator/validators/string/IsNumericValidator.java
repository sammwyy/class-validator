package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsNumeric;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

public class IsNumericValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsNumeric.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isNumeric(value);
    }
}
