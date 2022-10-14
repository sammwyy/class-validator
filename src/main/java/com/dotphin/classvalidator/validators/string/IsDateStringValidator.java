package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsDateString;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

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
