package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsLength;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

public class IsLengthValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsLength.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        IsLength annotation = field.getAnnotation(IsLength.class);
        return StringUtils.isLength(value, annotation.min(), annotation.max());
    }
}
