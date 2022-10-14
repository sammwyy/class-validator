package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsMagnetURI;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

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
