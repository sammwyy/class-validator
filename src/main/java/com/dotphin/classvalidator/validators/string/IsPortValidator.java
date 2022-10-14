package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsPort;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

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
