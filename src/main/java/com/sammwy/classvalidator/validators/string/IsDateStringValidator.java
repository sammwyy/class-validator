package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsDateString;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

public class IsDateStringValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsDateString.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isDateString(value);
    }
}
