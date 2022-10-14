package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsEthereumAddress;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

public class IsEthereumAddressValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsEthereumAddress.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isEthereumAddress(value);
    }
}
