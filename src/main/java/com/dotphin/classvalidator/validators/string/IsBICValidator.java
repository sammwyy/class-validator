package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsBIC;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

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
