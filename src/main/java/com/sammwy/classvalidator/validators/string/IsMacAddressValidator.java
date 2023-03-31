package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsMacAddress;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

public class IsMacAddressValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsMacAddress.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isMacAddress(value);
    }
}
