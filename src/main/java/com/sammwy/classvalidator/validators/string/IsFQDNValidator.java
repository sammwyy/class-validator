package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsFQDN;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

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
