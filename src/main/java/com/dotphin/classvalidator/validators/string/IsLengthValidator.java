package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsLength;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

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
