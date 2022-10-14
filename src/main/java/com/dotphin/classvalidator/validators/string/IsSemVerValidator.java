package com.dotphin.classvalidator.validators.string;

import java.lang.reflect.Field;

import com.dotphin.classvalidator.string.IsSemVer;
import com.dotphin.classvalidator.utils.StringUtils;
import com.dotphin.classvalidator.validators.StringValidator;

public class IsSemVerValidator extends StringValidator {
    @Override
    public Class<?> getAnnotation() {
        return IsSemVer.class;
    }

    @Override
    public boolean isValid(Field field, String value) {
        return StringUtils.isSemVer(value);
    }
}
