package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsPort;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

public class IsPortValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsPort.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isPort(value);
    }
}
