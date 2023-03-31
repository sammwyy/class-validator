package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsBTCAddress;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

public class IsBTCAddressValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsBTCAddress.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isBTCAddress(value);
    }
}
