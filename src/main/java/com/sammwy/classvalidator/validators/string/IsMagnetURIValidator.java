package com.sammwy.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.sammwy.classvalidator.string.IsMagnetURI;
import com.sammwy.classvalidator.utils.StringUtils;
import com.sammwy.classvalidator.validators.StringValidator;

public class IsMagnetURIValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsMagnetURI.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isMagnetURI(value);
    }
}
