package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsEmail;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

public class IsEmailValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsEmail.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isEmail(value);
    }
}
