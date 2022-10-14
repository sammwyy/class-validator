package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsNumeric;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

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
