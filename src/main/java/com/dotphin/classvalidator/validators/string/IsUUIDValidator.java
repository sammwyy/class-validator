package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsUUID;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

public class IsUUIDValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsUUID.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isUUID(value);
    }
}
