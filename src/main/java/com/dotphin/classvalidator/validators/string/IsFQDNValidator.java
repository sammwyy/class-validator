package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsFQDN;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

public class IsFQDNValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsFQDN.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isFQDN(value);
    }
}
