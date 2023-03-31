package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsUUID;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

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
