package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsBIC;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

public class IsBICValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsBIC.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isBIC(value);
    }
}
