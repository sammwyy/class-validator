package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsLowerCase;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

public class IsLowerCaseValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsLowerCase.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isLowerCase(value);
    }
}
