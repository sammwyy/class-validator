package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.Length;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

public class LengthValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return Length.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        Length annotation = field.getAnnotation(Length.class);
        return StringUtils.isLength(value, annotation.min(), annotation.max());
    }
}
