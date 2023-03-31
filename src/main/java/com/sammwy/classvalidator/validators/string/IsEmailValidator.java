package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsEmail;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

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
