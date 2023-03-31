package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsMongoID;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

public class IsMongoIDValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsMongoID.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isMongoID(value);
    }
}
